package amazonavn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonhome {

	@Test
	public void amazon() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\source\\repos\\TestProject1\\TestProject1\\drivers\\chromeD\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
	}
}
