package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethods {

	@Given("Click CRMSFA Link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Given ("Click Leads Tab")
	public void clickLeadstab() {

		driver.findElement(By.linkText("Leads")).click();
	}

	@And ("Click Create Leads Link")
	public void clickCreateLeadsLink() {

		driver.findElement(By.linkText("Create Lead")).click();
		
	}
	@When("Type the company name as (.*)$")
	public void typeCompanyName(String companyName) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}


	@And ("Type the first name as (.*)$")
	public void typefirstName(String firstName) {


		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		
	}

	@And ("Type the last name as (.*)$")
	public void typelastName(String lastName) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		
	}

	@And("Click Create Leads Button")
	public void clickCreateLeadsButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the View Leads Page")
	public void verifyViewLeads() {
		String title = driver.getTitle();
		if(title.contains("View Leads")) {
			System.out.println("View Leads Page displayed");
		}
	}




}
