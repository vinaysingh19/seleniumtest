package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
  	  
	  WebDriver driver;
	   
		@BeforeMethod
		public void launch() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://13.233.198.241:32768/gameoflife/");
		
		}
		
	  @Test
	  public void verfiy() {
		  driver.findElement(By.linkText("New Game")).click();
  }
	  @AfterMethod
	  public void close() {
		 driver.close();
	  }
}
