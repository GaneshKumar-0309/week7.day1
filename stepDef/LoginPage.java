package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProjectSpecificMethods{


	@Given ("Type the username as {string}")
	public void typeUsername(String username) {

		driver.findElement(By.id("username")).sendKeys(username);

	}

	@And ("Type the password as {string}")
	public void typePassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When ("Click on the Login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then ("Verify the homescreen is displayed")
	public void verifyHomescreen() {
		
		String welcomeText = driver.findElement(By.tagName("h2")).getText();
		
		if (welcomeText.contains("Welcome")) {
			
			System.out.println("Home screen Displayed");
			
		}

	}

	@But ("Error message is displayed")
	public void verifyError() {
		
		String erroMessage = driver.findElement(By.id("errorDiv")).getText();

		System.out.println(erroMessage);
	}
 
}
