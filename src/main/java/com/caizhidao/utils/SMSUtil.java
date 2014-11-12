package com.caizhidao.utils;

import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.caizhidao.common.Configuration;

/**
 * 发送手机短信类
 * 
 * @author Jail Hu
 */
public class SMSUtil {

	/**
	 * 发送手机短信
	 * 
	 * @param phone
	 *            手机号码
	 * @param msg
	 *            短信内容
	 * @return string
	 * @throws IOException
	 *             io错误
	 */
	public static String sendMessage(String phone, String msg)
			throws IOException {
		DefaultHttpClient client = new DefaultHttpClient();
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 60000);
		String url = Configuration.getInstance().getSms_url() + "&" + "mobile="
				+ phone + "&content="
				+ URLEncoder.encode(msg + "【银大贵金属】", "UTF-8");
		HttpGet httpGet = new HttpGet(url);
		try {
			return client.execute(httpGet, new BasicResponseHandler());
		} catch (Exception e) {
			// 取消请求
			httpGet.abort();
			throw new IOException("httpclint 请求失败，url=" + url, e);
		} finally {
			httpGet.releaseConnection();
			client.getConnectionManager().closeExpiredConnections();
		}
	}

	public static boolean sendMessage1(String phone, String msg) {
		try {
			String result = sendMessage(phone, msg);
			StringReader sr = new StringReader(result);

			InputSource is = new InputSource(sr);

			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();

			DocumentBuilder builder;
			try {
				builder = factory.newDocumentBuilder();
				Document doc = builder.parse(is);
				String resultMessage = doc.getElementsByTagName("message")
						.item(0).getFirstChild().getNodeValue();
				System.out.println("发送短信返回message ： " + resultMessage);
				return resultMessage.replaceAll("\\s", "").toLowerCase().equals("ok");
			} catch (ParserConfigurationException | SAXException e) {
				return false;
			}
		} catch (IOException e) {
			return false;
		}

	}
}
