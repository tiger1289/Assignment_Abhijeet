package ready;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_2 {

	@Test
	public void gamer2() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().accept();
		WebElement element= driver.findElement(By.id("result"));
		System.out.println(element.getText());
		String obj1="You clicked: Ok";
		AssertJUnit.assertEquals(element.getText(),obj1);

		
		

	}


}