package TakeScreenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserExecution 
{
	WebDriver driver;
	@Parameters({"browsername","url"})
	@Test
	public void crossBrowser(String bName,String url) throws InterruptedException
	{
		if(bName.contains("chrome"))
				driver=new ChromeDriver();
		else if(bName.contains("edge"))
			driver=new EdgeDriver();
		else 
			System.out.println("Enter valid browser input");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
