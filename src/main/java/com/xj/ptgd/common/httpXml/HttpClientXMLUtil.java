package com.xj.ptgd.common.httpXml;


import com.xj.ptgd.common.logs.LogUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class HttpClientXMLUtil {
    private static Logger log = LogUtils.getHttpXMLLogger();
    /**
     * @param args
     */
    public static void main(String[] args) {
        String url = "http://192.168.0.68/integration/xml";
        HttpClientXMLUtil tmi = new HttpClientXMLUtil();
        log.info(tmi.post(url,"listSummaryMeeting.xml"));
    }



    /**
     * 发送xml数据请求到server端
     * @param url xml请求数据地址 xml String 发送的xml数据流
     * @return null发送失败，否则返回响应内容
     */
    public String post(String url,String xmlFileName){
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
            myPost.setRequestHeader("charset","utf-8");

            //设置请求体，即xml文本内容，注：这里写了两种方式，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
//          myPost.setRequestBody(xmlString);

            InputStream body=this.getClass().getResourceAsStream("/"+xmlFileName);
            myPost.setRequestBody(body);
//            myPost.setRequestEntity(new StringRequestEntity(xmlString,"text/xml","utf-8"));
            int statusCode = client.executeMethod(myPost);
            if(statusCode == HttpStatus.SC_OK){
                BufferedInputStream bis = new BufferedInputStream(myPost.getResponseBodyAsStream());
                byte[] bytes = new byte[1024];
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                int count = 0;
                while((count = bis.read(bytes))!= -1){
                    bos.write(bytes, 0, count);
                }
                byte[] strByte = bos.toByteArray();
                responseString = new String(strByte,0,strByte.length,"utf-8");
                bos.close();
                bis.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        myPost.releaseConnection();
        return responseString;
    }

    /**
     * 用传统的URI类进行请求
     * @param urlStr
     */
    public void testPost(String urlStr) {
        try {
            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");

            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
            String xmlInfo = getXmlInfo();
            System.out.println("urlStr=" + urlStr);
//            System.out.println("xmlInfo=" + xmlInfo);
            out.write(new String(xmlInfo.getBytes("UTF-8")));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con
                    .getInputStream()));
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getXmlInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");
        sb.append("<Message>");
        sb.append(" <header>");
        sb.append("     <action>readMeetingStatus</action>");
        sb.append("     <service>meeting</service>");
        sb.append("     <type>xml</type>");
        sb.append("     <userName>admin</userName>");
        sb.append("     <password>admin</password>");
        sb.append("     <siteName>box</siteName>");
        sb.append(" </header>");
        sb.append(" <body>");
        sb.append("     <confKey>43283344</confKey>");
        sb.append(" </body>");
        sb.append("</Message>");

        return sb.toString();
    }
}
