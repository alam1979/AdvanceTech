package testNGclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliHendle {

/*public static void main(String[] args) throws FindFailed {
// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
WebDriverWait wait=new WebDriverWait(driver,20);
driver.manage().window().maximize();
driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
Screen screen=new Screen();
screen.wait("1398665726055.png", 20);
screen.click("1398666382715.png");
screen.click("1398666248846.png");
screen.click("1398666729252.png");
screen.click("1398666188894.png");
screen.click("1398665763634.png");
screen.click("1398666592027.png");
screen.click("1398666610951.png");
screen.click("1398666308624.png");
screen.click("1398666326406.png");
screen.click("1398666570749.png");
screen.click("1398666703708.png");
screen.click("1398666382715.png");
screen.click("1398666857321.png");
screen.waitVanish("1398665763634.png");}} */
	
	
	//1-Download Sikuli jars from here (My Google Driver)- Download Jars
	//2- Add Sikuli jar into your project.
	
	//Once Setup is complete then we can start writing selenium/sikuli scripts.
	
	//We will use some Sikuli classes that we will get once we will add that jars into the project.
	
	//1-Screen – This is a class, which will focus on the screen.
	//2- Pattern- This is another class, which will focus on images.


    @Test
    public void fileUpload() throws Exception{
    System.setProperty("webdriver.gecko.driver","./DriverBrowser/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();

    driver.get("http://demo.automationtesting.in/Register.html");
    driver.findElement(By.id("imagesrc")).click();

    Thread.sleep(5000);

    Pattern fileNameInput = new Pattern("D:\\Selenium\\FileOpenInput.PNG");
    Pattern openButton = new Pattern("D:\\Selenium\\OpenButton.PNG");

    Screen screen = new Screen();
    screen.type(fileNameInput, "D:\\Selenium\\OpenButton.PNG");
    screen.click(openButton);
    }}



          /*//We have to create Screen class object to access method

                Screen screen = new Screen();

            //Create object of Pattern class and specify the images path

              Pattern image = new Pattern("C:\\gmail.PNG");

              Pattern image1 = new Pattern("C:\\images\\uname.PNG");

              Pattern image2 = new Pattern("C:\\images\\password.PNG");

               Pattern image3 = new Pattern("C:\\images\\click.PNG");

             WebDriver driver=new FirefoxDriver();

              driver.manage().window().maximize();

            driver.get("http://www.google.com");

            screen.wait(image, 10);

           //using screen object we can call click method which will accept image path and will perform //action

             //This will click on gmail image on google home page

              screen.click(image);

          //using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.

         //This  will type on username field

          screen.type(image1, "mukeshotwani@gmail.com");

         //This will type of password field

        screen.type(image2, "password1");

        //This will click on login button

          screen.click(image3);

           }}*/

