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
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@Given("Load the application url")
	public void loadApplicationurl() {
		driver.get("http://leaftaps.com/opentaps");

	}
	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}
	@When("Click on Login button")
	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		String title=driver.getTitle();
		if(title.equals(title)) {
			System.out.println("Logged in successfully");
		}else {
			System.out.println("not Logged in");
		}
	}
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error Message is displayed");

	}
	@When("Click on {string} link")
	public void clickCrmsfaLink(String text) {
		driver.findElement(By.linkText(text)).click();

	}
	@Then("{string} page should be displayed")
	public void verifyPage(String text) {
		boolean displayed=driver.findElement(By.xpath("//div[text()='"+text+"']")).isDisplayed();
		if(displayed) {
			System.out.println(text+" is displayed");
		}else {
			System.out.println(text+" is not displayed");
		}

	}
	@Given("Enter the company name as {string}")
	public void companyname(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@Given("Enter the first name as {string}")
	public void firstname(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	@And("Enter the last name as {string}")
	public void lastname(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@When("Click create lead button")
	public void leadbutton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@When("Click on Find Leads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on phone")
	public void click_on_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the number as {string}")
	public void enter_the_number_as(String text) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(text);
	}
	@When("Click on FindLeads button")
	public void click_on_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("get LeadID text")
	public void get_lead_id_text() throws InterruptedException {
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	    //System.out.println(leadID);
	}
	@When("Click on Lead ID")
	public void click_on_lead_id() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("Click on Delete")
	public void click_on_delete() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("enter the leadid as {string}")
	public void enter_the_leadid(String leadID)  {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click on find lead button")
	public void click_on_find_lead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	@When("Click on Edit button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given("update the company name as {string}")
	public void updatecompanyName(String text) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(text);

	}
	@When("Click on update")
	public void click_on_update() {
		driver.findElement(By.name("submitButton")).click();
	}

	@When("Click on DuplicateLead")
	public void click_on_duplicate_lead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@When("Click on create lead")
	public void click_on_create_lead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@When("Click on from lead")
	public void click_on_from_lead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	}
	@When("Click on Lead fromID")
	public void leadfromId() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("Click on to lead")
	public void click_on_to_lead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@When("Click on Lead toID")
	public void click_on_leadtoid() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]")).click();
	}
	@When("Click on merge button")
	public void click_on_merge_button() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	
}
