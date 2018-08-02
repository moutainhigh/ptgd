package com.xj.ptgd;

import com.xj.ptgd.common.util.HttpClientUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PtgdApplicationTests {

    @Test
    public void contextLoads() {
    }

    final static String postUrl = "https://portal.chinacscs.com/SYService";
    // 接入用户ID
    final static String username = "XWJY_TEST";
    // 接入用户密码
    final static String password = "3D0A5CB9";
    // 接入用户合作机构编号
    final static String merchantId = "ZXWJY_0411";

    @Test
    public void httpUtil(){

        //获取 token
        String	LoginResult = Login(username,password,postUrl);
        JSONObject jsonObj;
        jsonObj =JSONObject.fromObject(LoginResult);
        String key = jsonObj.get("token").toString();

        //命中为1 未命中 为2 status
        String status="2";
        String utCaseCode="";//案号
        String callResult = null;
        String resultCode="error";//结果码
        Map<String, String> params = new HashMap<String, String>();
        //系统参数
        params.put("reqId", "25dcf7db266c249a9b161111");
        params.put("merchantId", merchantId);
        params.put("token", key);
        //业务参数
        params.put("queryNo", "110111198301242836");//组织机构代码/个人身份证号码"110111198301242836"
        JSONArray relust=null;
        String ObjectType="DisruptInfo";
        try {
            callResult = HttpClientUtil.doHttpPostAction(postUrl, ObjectType, params);
            if(callResult!=null&&!("".equals(callResult))){
//                JSONObject jsonObj = (JSONObject)(new JSONParser().parse(callResult));
//                resultCode=jsonObj.get("code").toString();
                if(resultCode==null||"".equals(resultCode))resultCode="";
                if("100".equals(resultCode)){
//                    String output=jsonObj.get("output").toString();
//                    JSONObject jsonObj1 = (JSONObject)(new JSONParser().parse(output));
//                    String ret= jsonObj1.get("result").toString();
//                    relust = JSONArray.parseArray(ret);
//                    System.out.println(relust.size()+"==output====="+output);
                    System.out.println(callResult);
                   /* if(relust.size()>0){
                        status="1";
                    }*/
                }

            }

        } catch (Exception e) {
            System.out.println("请求异常" + e);
        }
    }

    public static String Login(String username,String password,String postUrl){

        String callResult = null;
        Map<String, String> params = new HashMap<String, String>();

        params.put("username", username);
        params.put("password", password);
        try {
            callResult = HttpClientUtil.doHttpPostAction(postUrl, "login", params);
        } catch (Exception e) {
            System.out.println("请求异常" + e);
        }
        return callResult;
    }



}
