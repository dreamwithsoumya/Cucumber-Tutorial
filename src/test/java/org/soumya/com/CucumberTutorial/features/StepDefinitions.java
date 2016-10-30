package org.soumya.com.CucumberTutorial.features;

import java.io.File;
import java.util.Map;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	@Given("^we are in google search page$")
	public void we_are_in_google_search_page() throws Throwable {
		File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");				
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
        driver = new PhantomJSDriver();	
        driver.get("http://www.google.com");         
	}

	@When("^I enter guru(\\d+) as q word$")
	public void i_enter_guru_as_q_word(int arg1) throws Throwable {
	    driver.findElement(By.name("q")).sendKeys("guru99");
	}

	@Then("^page title should be according to search parameter$")
	public void page_title_should_be_according_to_search_parameter() throws Throwable {
		System.out.println(driver.getTitle());
		driver.quit();
	    
	}


	
}
