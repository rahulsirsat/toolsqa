package basicprogams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathadvance {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebElement emailorphone = driver.findElement(By.xpath("//input[contains(@class,'whsOnd zHQkBf') and contains(@name,'identifier')]"));
		emailorphone.sendKeys("sirsat333@gmail.com");
		WebElement nextbutton = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d') and contains(@jsname,'V67aGc')]//preceding::button[3]"));
		nextbutton.click();
		Thread.sleep(1000);
		WebElement recovery = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
				//className("whsOnd zHQkBf"));
		
		recovery.sendKeys("8446475707");
		WebElement Nextbutton = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d') and contains(@jsname,'V67aGc')]"));
		Nextbutton.click();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='firstName']"));
		firstname.sendKeys("Rahul");
		WebElement lastname = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='lastName']"));
		lastname.sendKeys("Sirsat");
		WebElement NextButton = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d')]"));
		NextButton.click();
		Thread.sleep(2000);
		WebElement nextBTN = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d')]"));
		nextBTN.click();
		Thread.sleep(1000);
		WebElement NEXTBTN = driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d')]"));
		NEXTBTN.click();
		
		
		}

}
