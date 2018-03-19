package com.stefdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.homepagefactory.HomePageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
    WebDriver driver;
	@Given("^user visit homepage$")
	
	public void user_visit_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	}
    @When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
	HomePageFactory obj = new HomePageFactory(driver);
	obj.getHomePageTitleText().click();
	  
	}
    @When("^user enter user name, password, confirm password$")
	public void user_enter_user_name_password_confirm_password() throws Throwable {
	HomePageFactory obj = new HomePageFactory(driver);
	obj.getUserName().sendKeys("vewhfe");
	obj.getUserPassword().sendKeys("fgaewyf");
	obj.getPassword().sendKeys("hfhjfvhj");
	}
    @When("^user click submit buttan$")
	public void user_click_submit_buttan() throws Throwable {
	HomePageFactory obj = new HomePageFactory(driver);
	obj.getSubmotButton().click();
	}
    @Then("^user recieves a confirmation$")
	public void user_recieves_a_confirmation() throws Throwable {
		
    /* System.out.println("Actual Home Page Title::"+driver.getTitle());
    System.out.println("Expected Home Page Tile::"+ pagefactory.getHomePageTitleText());
	// verify
	if(driver.getTitle().equalsIgnoreCase(pagefactory.getHomePageTitleText())) {
     System.out.println("Test Passed");
	}
	else {
	System.out.println("Test Failed");
    }
	//assert or validate
	assertEquals(pagefactory.getHomePageTitleText(),driver.getTitle());*/
		  
   	driver.quit();
    }
	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		
	}}

