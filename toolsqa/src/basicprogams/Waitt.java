package basicprogams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit waiit
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8446475707");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sirsat");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("sirsat333gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("123456");
		//Thread.sleep(1000);
		
		Select day = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		day.selectByIndex(5);
		Select month = new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		month.selectByIndex(4);
		Select year = new Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
		year.selectByIndex(34);
		//Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input._8esa[value='-1']")).click();
		driver.findElement(By.cssSelector("input._8esa[value='1']")).click();
		driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

		/*
		explicit wait
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for^='u_2_4_']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for='u_2_4_hO']"))).click();
		*/
		
		}
	}
