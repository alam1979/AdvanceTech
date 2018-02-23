package com.collectionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
       public class testingYahoo {
				
			
        WebDriver driver;
	    @Test
	    public void funwithYahooPage () {
		//WebDriver driver = new FirefoxDriver ();
	    	
	    //System.setProperty("webdriver.gecko.driver", "./DriverBrowser/geckodriver.exe");
		//driver = new FirefoxDriver(); //create chrome instance
		
		//System.setProperty("webdriver.chrome.driver","./DriverBrowser/chromedriver.exe");
		//driver = new ChromeDriver();
		
	    	System.setProperty("webdriver.ie.driver","./DriverBrowser/IEDriverServer.exe");
			//create Edge instance
	    	WebDriver driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.edge.driver","./DriverBrowser/MicrosoftWebDriver.exe");
		//WebDriver driver = new EdgeDriver();
        
		
		driver.get("http://www.yahoo.com");
		driver.findElement(By.xpath(".//*[@id='uh-logo']"));
		driver.manage().window().maximize();
		
		List<WebElement> listimages = driver.findElements(By.tagName("img"));
		System.out.println("no of images on page:"+ listimages.size());}}
		
		
		

 /*       List<WebElement> ar = driver.findElements(By.linkText("data-rapid_p"));
		System.out.println(ar.toString());
	    for(int i = 0; i<ar.size(); i++) {
	    System.out.println(ar.get(i));}}}*/
	
	/*	driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Nutrition");
		driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();
		driver.findElement(By.xpath("//a[@referrerpolicy='unsafe-url']")).click();
		Thread.sleep(7000);
		// Find images by list
		List<WebElement> listimages = driver.findElements(By.tagName("img"));
		System.out.println("no of images on page:"+ listimages.size());
		*/
		
/*		ArrayList<String> ar=new ArrayList <String>();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("5");
		ar.add("6");
		ar.add("7");
		ar.add("8");
		System.out.println(ar.size()); 
	    for(int i = 0; i<ar.size(); i++) {
	    System.out.println(ar.get(i));
		
	    }}}
		 */
/*		 
		 
		 driver.findElement(By.xpath(".//*[@id='yucs-login_signIn']")).click();
		 driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("abcdefg");
		 driver.findElement(By.xpath(".//*[@id='login-username-form']/p[2]/span[1]/label"));
		 driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		 Assert.assertEquals("Sorry, we don't recognize this email.", "Sorry, we don't recognize this email.");
		 }}*/