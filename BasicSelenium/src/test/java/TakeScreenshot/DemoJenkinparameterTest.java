package TakeScreenshot;

import org.testng.annotations.Test;

public class DemoJenkinparameterTest 
{
	@Test
	public void demoJenkinParameter()
	{
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
	}
}
