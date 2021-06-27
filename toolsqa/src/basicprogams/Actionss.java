package basicprogams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		//call actions class
		
		Actions actions = new Actions(driver);
		
		WebElement username = driver.findElement(By.cssSelector("input#userName"));
		actions.keyDown(username, Keys.SHIFT).sendKeys("rahul").keyUp(Keys.SHIFT).build().perform();
		
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		actions.sendKeys(email, "sirsat333@bmail.com").perform();
		
		WebElement currentadress = driver.findElement(By.cssSelector("textarea#currentAddress"));
		actions.sendKeys(currentadress, "phulenagar,Tq-kaij,Dist-Beed.").perform();
		actions.keyDown(currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		//keyUp(Keys.CONTROL).
		WebElement prmanantadress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		//actions.keyDown(prmanantadress,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(prmanantadress, "v").perform();
		WebElement submitbtn = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
		driver.findElement(By.cssSelector("img[style='vertical-align:middle']")).click();
		Thread.sleep(1000);
		actions.click(submitbtn).perform();
		actions.moveToElement(driver.findElement(By.cssSelector("p.mb-1#permanentAddress"))).perform();
		
						
	
	}

}
