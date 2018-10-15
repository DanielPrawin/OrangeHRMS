package MavenDemo_Group.Maven_Demo_Artifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class App 
{
    public static void main( String[] args ) throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
		
       // WebDriver driver=new FirefoxDriver();
	
		driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	Thread.sleep(5000);
    	driver.findElement(By.name("q")).sendKeys("Selenium");
    	driver.findElement(By.name("btnK")).click();
		
//		driver.get("http://apps.qaplanet.in/qahrm/login.php");
//		//wait 2 sec
//		Thread.sleep(2000);
//		
//		//clear username
//		driver.findElement(By.name("txtUserName")).clear();
//		//enter username
//		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
//		
//		//clear password
//		driver.findElement(By.name("txtPassword")).clear();
//		//enter pasword
//		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
//    
        
    }
}
