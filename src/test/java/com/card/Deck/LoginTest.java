package com.card.Deck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public final class LoginTest {

	WebDriver driver;
	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
		  driver = new ChromeDriver();
	 
	}

	@Given("^Put URL and go to login page$")
	public void put_URL_and_go_to_login_page() throws Throwable {
	    driver.get("https://disneyworld.disney.go.com/");
	    
	    String pagetitle= driver.getTitle();
	    
	    System.out.println(pagetitle);
	    
	    if (pagetitle.contains("Walt Disney World")) {
	    	
	    	System.out.println("Got Disney home page");
	    	TakeScreenShot.captureScreenShot(driver, "Disney home page");
	    	
	    }
	    else {
	    	System.out.println("Something went wrong and check screen shot");
	    	
	    	TakeScreenShot.captureScreenShot(driver, "Disney home page");
	    }
	    
	}

	@When("^User able to click my account$")
	public void user_able_to_click_my_account() throws Throwable {
	    driver.findElement(By.xpath("//*[contains(text(),'Sign In or Create Account')]")).click();
	    
	}

	@When("^Validate as its login page$")
	public void validate_as_its_login_page() throws Throwable {
	    
	    String loginPage = driver.getTitle();
   System.out.println(loginPage);
	    if (loginPage.contains("ddddddd")) {
	    	
	    	System.out.println("login page");
	    	TakeScreenShot.captureScreenShot(driver, "Login Page");
	    	
	    }
	    else {
	    	System.out.println("Something went wrong and check screen shot");
	    	
	    	TakeScreenShot.captureScreenShot(driver, "Login page");
	    }
	    
	    
	}

	@When("^User able to take screen Shot of login page$")
	public void user_able_to_take_screen_Shot_of_login_page() throws Throwable {
	    
		TakeScreenShot.captureScreenShot(driver, "Login page2");
	}

	@When("^User able to use valid <user_name>$")
	public void user_able_to_use_valid_user_name(DataTable userName) throws Throwable {
	
	    
		List<List<String>> obj =userName.raw();
		
		driver.findElement(By.xpath("//*[@id='loginPageUsername']")).sendKeys(obj.get(1).get(0));
		
	}

	@When("^User able to put valid <password>$")
	public void user_able_to_put_valid_password(DataTable password) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> mypassword =password.raw();
		
		driver.findElement(By.xpath("//*[@id='loginPagePassword']")).sendKeys(mypassword.get(1).get(0));
		
	    
	}

	@When("^User able to click submit button$")
	public void user_able_to_click_submit_button() throws Throwable {
	    driver.findElement(By.xpath("//*[@class='buttonText']")).click();
	    
	}

	@Then("^User able to validate Login status$")
	public void user_able_to_validate_Login_status() throws Throwable {
	   String homepageTitle=driver.getTitle();
	   System.out.println(homepageTitle);
	    if (homepageTitle.contains("ddddddd")) {
	    	
	    	System.out.println("login page");
	    	TakeScreenShot.captureScreenShot(driver, "Login Page");
	    	
	    }
	    else {
	    	System.out.println("Something went wrong and check screen shot");
	    	
	    	TakeScreenShot.captureScreenShot(driver, "Login page");
	    }
	}

	@Then("^User able to take screen Shot of home page$")
	public void user_able_to_take_screen_Shot_of_home_page() throws Throwable {
		TakeScreenShot.captureScreenShot(driver, "HomePage");
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	
		driver.quit();//=== browser + driver
	    
	}
	

}