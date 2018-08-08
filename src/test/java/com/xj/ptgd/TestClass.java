package com.xj.ptgd;

import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.common.util.JaxbUtil;
import com.xj.ptgd.common.util.Transcoding;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.User;
import com.xj.ptgd.entity.in.TestXMLIn;
import com.xj.ptgd.entity.out.TestXMlOut;
import org.junit.Test;

import javax.xml.bind.JAXBException;


public class TestClass{
	@Test
	public void testXML()throws JAXBException {
//		JAXBContext context = JAXBContext.newInstance(In.class);

//		Marshaller marshaller = context.createMarshaller();
//		Unmarshaller unmarshaller = context.createUnmarshaller();
/*
		In boy = new In();
		XMLHeadDto a = new XMLHeadDto();
		a.setChnNo("123");
		a.setInstID("sdfs");
		User user = new User();
		user.setUserId(12);
		boy.setHead(a);
		boy.setBody(user);
		marshaller.marshal(boy, System.out);
		System.out.println();

		String xml = "<In><Head><ChnNo>111</ChnNo></Head></In>";
		In boy2 = (In) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(boy2.getHead().getChnNo());*/
	}

	/**
	 * @throws JAXBException
	 */
	@Test
	public void showMarshaller() {
		User user = new User();
		user.setUserName("中国");
		user.setUserId(123);
//		String str = JaxbUtil.convertToXml(user);
//		System.out.println(str);
	}

	/**
	 *
	 */
	@Test
	public void ObjToXml() {
        TestXMlOut ret = new TestXMlOut();
        XMLHeadDto head = new XMLHeadDto();
        User user = new User();
        user.setUserId(12243);
        head.setChnNo("123");
//        ret.setHead(head);
        ret.setBody(user);
        String srt = ResultUtil.getResult(ret,TestXMlOut.class);
		String srt2 = "";
        try {
			System.out.println(ret.getClass().getName());
        	srt2 = ResultUtil.setHeadAndGetResult(head,ret,User.class);
		}catch (Exception e){
        	System.out.println(e.getMessage());
		}
		srt2 = ResultUtil.setHeadAndGetResult(head,ret,User.class);
		System.out.println(srt2);

     /*   JaxbUtil ju2 =new JaxbUtil(TestXMlOut.class);
        String s = ju2.toXml(ret,"ISO-8859-1");
        System.out.println(s);*/
	}

	@Test
	public void xmlToObj()throws Exception{
		String reqXML="<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" +
				"<In>" +
				"	<Head>" +
				"		<Version>1.0.1</Version>" +
				"		<InstId>BJCEB</InstId>" +
				"		<InstID>BJCEB</InstID>" +
				"		<AnsTranCode>BJCEBQBIReq</AnsTranCode>" +
				"		<TrmSeqNum>00711497180212094224</TrmSeqNum>" +
				"	</Head>" +
				"	<Body>" +
					"	<billKey>finance|160396371336101889</billKey>" +
					"	<companyId>020001792</companyId>" +
					"	<beginNum>1</beginNum>" +
					"	<queryNum>1</queryNum>" +
				"	</Body>" +
				"</In>";
		JaxbUtil ju =new JaxbUtil(TestXMLIn.class);
		TestXMLIn country = ju.fromXml(reqXML);
		System.out.println(country);
	}


	@Test
	public void zm()throws Exception {
		String str = "万科";
		String gbk = new String(str.getBytes("GBK"),"GBK");
		Transcoding.StringForTranscodingType(gbk);
		String iso = new String(str.getBytes("ISO-8859-1"), "ISO-8859-1");
		Transcoding.StringForTranscodingType(iso);

		String t = "这是一个字符串aaa111";
		String utf8 = new String(t.getBytes( "UTF-8"));
		System.out.println(utf8);
		String unicode = new String(utf8.getBytes(),"UTF-8");
		System.out.println(unicode);
		String gbk2 = new String(unicode.getBytes("GBK"));

		System.out.println(gbk2);
		pr(gbk);
	}

	public static void pr(String str){
		System.out.println(getEncoding(str));
	}
	public static String getEncoding(String str) {
		String encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";
	}
}