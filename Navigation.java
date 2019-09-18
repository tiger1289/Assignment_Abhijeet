import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Navigation {
	@Test
	public void verifyHomepageTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		String url = "http://the-internet.herokuapp.com/context_menu";
		driver.get(url);
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
		actions.contextClick(elementLocator).perform();
		Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		System.out.println(alerttext);
		String actualTitle = alerttext;
		String expectedTitle = "You selected a context menu";
		assertEquals(expectedTitle,actualTitle);
		
	}

}
