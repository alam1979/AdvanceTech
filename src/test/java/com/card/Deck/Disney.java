package com.card.Deck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Disney {
	
	@Test
	public void DisneyWorldClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
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
		
		
	}


