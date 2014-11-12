package web.background;

import java.util.Random;

import org.junit.Test;

public class TestIdentityCode extends BaseTest{

	
	@Test
	public void getSex(){
		String a = "330226198212020021";
		String ne = a.replaceAll("[^\\d]", "");
		System.out.println(ne.substring(ne.length()-1, ne.length()));
	}
	
	@Test
	public void getVeriCode(){
		int min = 1000,max = 9999; 
		 Random rand= new Random();
	      int tmp = Math.abs(rand.nextInt());
	     System.out.println( tmp % (max - min + 1) + min);
	}
	
}
