package org.soumya.com.selenium.test;

import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void test() {
		
		
			File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");				
	        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	        WebDriver driver = new PhantomJSDriver();	
	  
	        driver.get("http://www.google.com"); 
		   WebElement element =  driver.findElement(By.name("q"));
		   element.sendKeys("guru99");
		   element.submit();
		    
		

		
			System.out.println(driver.getTitle());
			driver.quit();
		    
		

	}

}
