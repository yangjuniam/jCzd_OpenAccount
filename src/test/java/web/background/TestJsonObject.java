package web.background;

import org.junit.Test;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class TestJsonObject extends BaseTest {

	@Test
	public void test() {
		
		
		try {
			System.out.println(JSONObject
					.fromObject(""));
		} catch (JSONException e) {

		}
	}

}
