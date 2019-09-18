import java.io.File;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;


public class CaptureScreenshot {
	 @Test
	public static void captureScreenMethod() throws Exception{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	         try{
	             driver.get("http://the-internet.herokuapp.com/");
	     driver.navigate().refresh();
	     
	     driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath 
	                }catch(Exception e){
	             File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           FileUtils.copyFile(screenshotFile, new File("D:\\failshot_Screenshot.ScreenShotOnFailure.png"));
	 }
	        driver.close();
	 driver.quit(); 
	 }
}
