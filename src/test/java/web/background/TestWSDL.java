package web.background;

import org.junit.Test;

import com.caizhidao.jiaoyisuo.sim.OpenMiAccountForUnitService;

public class TestWSDL extends BaseTest {
	
	@Test
	public void testa(){
		OpenMiAccountForUnitService s = new OpenMiAccountForUnitService();
		System.out.println(s.getOpenMiAccountForUnitServiceHttpEndpoint());
		System.out.println(s.getWSDLDocumentLocation());
		System.out.println(s.getServiceName());
		System.out.println(s.getOpenMiAccountForUnitServiceHttpSoap11Endpoint().openAndCheck(
				"", "", "", "", "",
				"", "", "", "", "", "", "",
				"", "", "", "", "", "",
				""));
	}
}
