

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_106_Mercury_Web_Tour_Explicitwait {

	public static void main(String[] args) {
		
		//SET system property
		
				System.setProperty("webdriver.chrome.driver","C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
				
				// instantiate an object
				WebDriver driver = new ChromeDriver();
				
				// navigate to the specified driver
				driver.get("http://demo.guru99.com/test/newtours/");
				  // Implicit Wait 
				 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
			// Explicit Wait
				 WebDriverWait wait = new WebDriverWait(driver,120);  
				  
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")));
				
				//way to maximize the browser
				  driver.manage().window().maximize();
				  
				  
				  
				// click in register link
					 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
					  
					
					// Enter a first name into this first name field 
					  driver.findElement(By.name("firstName")).sendKeys("Test99");
					  
					  // Enter your last  name into the last name field
					  driver.findElement(By.name("lastName")).sendKeys("Zaman");
					  
					  // enter your phone number
					  
					  driver.findElement(By.name("phone")).sendKeys("704-800-0000");
					  
					  // enter your email address
					  driver.findElement(By.id("userName")).sendKeys("sekaskahriar@gmail.com");
					  
					  // Select country name from the country dropdown list
					  Select drpCountryName = new Select(driver.findElement(By.name("country")));    
					  drpCountryName.selectByVisibleText("UNITED STATES");
					  
					  // Enter a username into this username  field 
					  driver.findElement(By.name("email")).sendKeys("azaman");
					  
					  
					  // Enter a password into this password  field 
					  driver.findElement(By.name("password")).sendKeys("abc123");
					  
					  
					  // Enter a reconfirmpassword into this reconfirm password  field 
					  driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
					   
					  
					  // Enter a reconfirmpassword into this reconfirm password  field 
					  driver.findElement(By.name("submit")).click();
					  
					  // close the browsers
					//  driver.quit();
					  
					  String myExpectedValue;  
					  myExpectedValue = "Note: Your user name is azaman.";
					  
					  String myActualValue;  
					  myActualValue = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText();
					  
					   System.out.println("myActualValue: " + myActualValue);
					  
					 
					  // Validation point inserted
					  
					   if (myExpectedValue.equals(myActualValue)) {    
					    
					    System.out.println("TC_107_ExceptionHandling is passed");
					  
					   }
					   
					   else {    
						    System.out.println("TC_104_MercuryWebTours_Registration is FAILED!");  
						   }
					   
					   
					   
					   // close the browsers
						 driver.quit();
				  
	}

}
