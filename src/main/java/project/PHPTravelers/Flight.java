package project.PHPTravelers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Flight extends LaunchBrowser{
    static Logger log=Logger.getLogger("flight");
    //static By cookies = By.xpath("//button[.='Got it!']");
      static By Flight=By.xpath("//a[contains(@class,'text-center flights')]");
       static By city=By.xpath("//div[@id='s2id_location_from']");
       static By city1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
       static By Tocity=By.xpath("//div[@id='s2id_location_to']");
       static By Tocity1=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
       static By checkin=By.xpath("//input[@id='departure']");
      static By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
       static By cookies=By.xpath("//button[.='Got it!']");
       public static void flights() throws InterruptedException
       {
           PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravelers\\PHPTravelers\\Resources\\Log4j.properties");
           
         
           //Fromcity
         
           driver.findElement(Flight).click();
           driver.findElement(city).click();
           
           driver.findElement(city1).sendKeys(prop.getProperty("city1"));
           driver.findElement(city1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(city1).sendKeys(Keys.ENTER);
           
           
         //Tocity
           driver.findElement(Tocity).click();
           driver.findElement(Tocity1).sendKeys(prop.getProperty("city2"));
           driver.findElement(Tocity1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(Tocity1).sendKeys(Keys.ENTER);
           driver.findElement(cookies).click();
           //date
           driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
           driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
           driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
           for(int i = 1 ; i<=35 ; i++) {             
                String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
                if(str1.equals("1")) {                 
                    for(int j = i ; j<=35 ; j++) {                     
                        str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
                        if(str1.equals(prop.getProperty("checkin_day1"))) {                         
                            driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
                            break;
                        }
                    }
                        }
                }
           //adults
         
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();  
        
           //child  
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();     
           //infant
           driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();     
           //search
           driver.findElement(By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]")).click();

 

           log.info("Flights Results - From to MAA to DEL");
           
           
           
           
          
       }
           
        
       }
 
		   
		                         
		
		                         
		

