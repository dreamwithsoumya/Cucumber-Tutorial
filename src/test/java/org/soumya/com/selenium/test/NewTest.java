package org.soumya.com.selenium.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	 private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");				
	        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	        driver = new PhantomJSDriver();	 
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	

}
