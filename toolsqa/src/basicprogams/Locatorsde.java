package basicprogams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsde {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		WebElement lastname=driver.findElement(By.id("lastname"));
		WebElement email =driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement male=driver.findElement(By.id("gender-radio-1"));
		WebElement female=driver.findElement(By.id("gender-radio-2"));
		
		
		
		firstname.sendKeys("Rahul");
		firstname.sendKeys("Sirsat");
		email.sendKeys("sirsat333@gmail.com");
		male.click();
		female.click();
		
		
		
		
		
		
	}

}
