package ready;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Assign_10 {
	@Test
	public void demo33(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/dropdown");
	AssertJUnit.assertFalse(driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[1]")).isEnabled());
	
	driver.quit();
	
	}

}
