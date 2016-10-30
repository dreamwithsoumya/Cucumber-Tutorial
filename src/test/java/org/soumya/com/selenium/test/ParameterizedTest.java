package org.soumya.com.selenium.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"name","crush","friend","brother"})
	public void parameterTest(String name,String crush,String friend,String brother){
		System.out.println("name : "+name + "crush "+crush+"friend "+friend+"brother "+brother);
	}

}
