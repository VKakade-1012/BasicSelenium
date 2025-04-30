package TakeScreenshot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TransferWindowControl 
{
	@Test
	public void transferWindowControl() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com");
		
		Set<String> ids = driver.getWindowHandles();
		for (String string : ids) 
		{
			driver.switchTo().window(string);
		}
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("vaishnavi");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
