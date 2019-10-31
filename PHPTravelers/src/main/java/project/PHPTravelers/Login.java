package project.PHPTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends LaunchBrowser {
	By email=By.xpath("//input[@placeholder='Email']");
	By password=By.xpath("//input[@placeholder='Password']");
	By rememberme=By.xpath("//label[@class='custom-control-label']");
	By login=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	By Cookie=By.xpath("//*[@id='cookyGotItBtnBox']/div/button");
public WebElement email()
{
	return driver.findElement(email);
}
public WebElement password()
{
	return driver.findElement(password);
}
public void rememberme1()
{
	 driver.findElement(rememberme).click();
}
public void login1()
{
	 driver.findElement(Cookie).click();
	 driver.findElement(login).click();
}
}
	
	
	
	
	
	




