package ready;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Assign_3 {

	
	@Test
	public void space() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		WebElement element=driver.findElement(By.id("target"));
		element.sendKeys(" ");
		WebElement element1=driver.findElement(By.id("result"));
		System.out.println(element1.getText());
		String obj1="You entered: SPACE";
		AssertJUnit.assertEquals(element1.getText(),obj1);
		
	}
	@Test
	public void arrow() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		WebElement element3=driver.findElement(By.id("target"));
		element3.sendKeys(Keys.ARROW_LEFT);
		WebElement element2=driver.findElement(By.id("result"));
		System.out.println(element2.getText());
		String obj1="You entered: LEFT";
		AssertJUnit.assertEquals(element2.getText(),obj1);
	}
}