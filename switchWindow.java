import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchWindow {
	@Test
	public void verifyWindow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		String url = "http://the-internet.herokuapp.com/windows";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "The Internet";
		assertEquals(expectedTitle,actualTitle);
	
	}

}
