package basicprogams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.sun.tools.javac.main.Arguments;

public class Javascriptexcutr {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//java Script Executer call into script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//use the method executer script
		WebElement username = null;
		username = (WebElement) js.executeScript("return document.getElementById('email')",username);
		//username = (WebElement) js.executeScript("return document.getElementById('email').value='sirsat333@gmail.com'");
		username.sendKeys("sirsat333@gmail.com");
		
		WebElement password = null;
		password = (WebElement) js.executeScript("return document.getelementById('pass');",password);
		//password = (WebElement) js.executeScript("return document.getelementById('pass').value='12345';");
		String className = (String) js.executeScript("return document.getElementById('pass').getAttribute()");
		//password.sendKeys("123450");
		
		js.executeScript("document.getElementById('email').style.border colour= 'Red'");
		js.executeScript("document.getElementById('email').value= 'sirsat333@gmail.com'");
		
		js.executeScript("alert('hellow world');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		js.executeScript("arguments[0].click();", loginbtn);
		
		

			//Refresh Browser
		
		js.executeScript("history.go(0)");
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
