package web.background;

import org.junit.Test;

import com.caizhidao.enums.ResultCodeEnum;

public class TestResultCodeEnum extends BaseTest {

	@Test
	public void test(){ 
		System.out.println(ResultCodeEnum.getName(-1));
	}
}
