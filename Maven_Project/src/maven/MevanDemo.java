package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MevanDemo {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.close();
	}
	
}
