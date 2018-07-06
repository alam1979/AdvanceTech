package com.card.Deck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon {
	
	@Test
	public void amazonMouseHover() {
	System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();

	Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	select.selectByValue("search-alias=appliances");
	
	
	
	
}}
