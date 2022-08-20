package stepDef;


import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethods {

	@Given ("Click on CRMSFA Link")
	public void clickCRMSFA() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}


	@And ("Click on Leads Tab")

	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And ("Click on Find Leads Link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When ("Type in the first name as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys(firstName);
	}

	@And ("Click Find Leads Button")
	public void clickFindLeadsButton(){
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@And ("Click on the first resulting lead")
	public void clickFirstResultingLead() throws InterruptedException{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
	}

	@Then ("Verify the View Leads Title Page")

	public void verifyViewLeadsPage(){
		System.out.println("The Title of the page is : "+driver.getTitle());
	}

	@And ("Click on Edit button")

	public void clickEditButton(){
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}

	@And ("Change the Company Name as (.*)$")
	public void changeCompanyName(String companyName){
		driver.findElement(By.id("updateLeadForm_companyName")).clear();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}

	@And ("Click on update button")
	public void clickUpdateButton(){

		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}

	@Then ("Confirm the Changed Name Appears")
	public void confirmChangedName(){

		String Name = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		System.out.println("The Company Name is : "+Name);

		if (Name.contains("Volante Technologies Pvt Limited")) {

			System.out.println("Company Name Succesfully changed");

		} else {

			System.out.println("The Company Name is not changed");
		}
	}

}