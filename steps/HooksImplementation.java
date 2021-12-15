package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends BaseClass {

	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//initializing the driver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");


	}
	@After
	public void postCondition() {
		driver.close();

	}
}
