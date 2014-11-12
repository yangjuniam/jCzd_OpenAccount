package web.background;

import java.io.IOException;

import org.junit.Test;

import com.caizhidao.utils.SMSUtil;

public class TestSMSUtil extends BaseTest {
	
	@Test
	public void testa(){
		try {
			System.out.println(SMSUtil.sendMessage("18621807761", "aaljsalfsad"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void replace(){
		System.out.println("aaaaa\rbbb\n".replaceAll("\\s", ""));
	}
}