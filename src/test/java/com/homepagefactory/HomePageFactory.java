package com.homepagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


    public class HomePageFactory {
	WebDriver driver;
	public HomePageFactory( WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }

  @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
  @CacheLookup
  WebElement register_link;
  public WebElement getHomePageTitleText() {
  return register_link;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
  @CacheLookup
  WebElement user_name;
  public WebElement getUserName() {
  return user_name;
 }

  @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
  @CacheLookup
  WebElement user_password;
  public WebElement getUserPassword() {
  return user_password;
  }
  @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
  @CacheLookup
  WebElement Confirm_Password;
  public WebElement getPassword() {
  return Confirm_Password;
  }
 
  @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
  @CacheLookup
  WebElement SubmitBotton;
  public WebElement getSubmotButton() {
  return SubmitBotton;

}}


