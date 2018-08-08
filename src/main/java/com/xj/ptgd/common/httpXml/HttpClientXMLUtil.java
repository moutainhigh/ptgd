package com.xj.ptgd.common.httpXml;


import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.util.Transcoding;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.slf4j.Logger;

public class HttpClientXMLUtil {
    private static Logger log = LogUtils.getHttpXMLLogger();
    /**
     * 发送xml数据请求到server端
     * @param url xml请求数据地址 xml String 发送的xml数据流
     * @return null发送失败，否则返回响应内容
     */
    public String post(String url,String xml){
        xml = Transcoding.UTFToISO(xml);
        String charset = "UTF-8";
        //关闭
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");

        //创建httpclient工具对象
        HttpClient client = new HttpClient();
        //创建post请求方法
        PostMethod myPost = new PostMethod(url);
        //设置请求超时时间
        client.setConnectionTimeout(300*1000);
        String responseString = null;
        try{
            //设置请求头部类型
            myPost.setRequestHeader("Content-Type","text/xml");
            myPost.setRequestHeader("charset",charset);

            //设置请求体，即xml文本内容，注：这里写了两种方式，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
            myPost.setRequestBody(xml);
            int statusCode = client.executeMethod(myPost);
            if(statusCode == HttpStatus.SC_OK){
                responseString = myPost.getResponseBodyAsString();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        myPost.releaseConnection();
        return responseString;
    }
}
