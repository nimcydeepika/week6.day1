package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
@Given("open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
@Given("load the application url")
    public void loadApplicationurl() {
    	driver.get("http://leaftaps.com/opentaps/");
		
	}
@Given("enter the username as {string}")
    public void enterUsername (String uName) {
    	driver.findElement(By.id("username")).sendKeys(uName);
	
}
@Given("enter the password as {string}")
    public void enterPassword(String passwd) {
    	driver.findElement(By.id("password")).sendKeys(passwd);
	
}
@When("click on login button")
    public void loginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
	
}
@Then("home page should be displayed")
    public void homepageDisplay() {
	
    	String title=driver.getTitle();
		System.out.println("The Title is"+title);
		
}

@But("error message should be displayed")
public void verifyerrorMessage() {
	System.out.println("error message is displayed");
}
@When("click on CRMSFA")
public void Clickcrmsfa() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("click on Leads")
public void clickleads() {
	driver.findElement(By.linkText("Leads")).click();
}
@When("click  on create lead")
public void createlead() {
	driver.findElement(By.linkText("Create Lead")).click();
	
}
@Given("type company name")
public void companyname() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
}
@Given("type first name")
public void firstname() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
}
@And("type last name")
public void lastname() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
}
@When("click create lead button")
public void leadbutton() {
	driver.findElement(By.name("submitButton")).click();
}



}
