package ready;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Assign_1 {
	@Test
	public void game() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/hovers");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		 Actions actions = new Actions(driver);
		 WebElement hover = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		 actions.moveToElement(hover).perform();
		 AssertJUnit.assertTrue(driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).size() != 0);
		 
		 
		
		 
		 driver.quit();
		
	}

	
}
