package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshot 
{
	@Test
	public void takeScreenshot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
		File temp = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/facebook.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
