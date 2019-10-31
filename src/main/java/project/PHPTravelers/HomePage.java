package project.PHPTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends LaunchBrowser  {
	
	By myaccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By signup = By.xpath("//a[@class='dropdown-item tr']");
	By login=By.xpath("//a[@class='dropdown-item active tr']");
	By hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights=By.xpath("//span[contains(text(),'Flights')]");
	
	
	
	public void signup() {
		driver.findElement(myaccount).click();
		driver.findElement(signup).click();
		
	}
	public void login() {
		
		driver.findElement(myaccount).click();
		driver.findElement(login).click();
		
	}

	public void hotel() {
		driver.findElement(hotel).click();
		
		
	}
	public void flights() {
		driver.findElement(flights).click();
		
		
	}
	
		}
	

