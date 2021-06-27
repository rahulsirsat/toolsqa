package basicprogams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtype {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
		//example absolute xpath
		
		WebElement testing = driver.findElement(By.className("featured-box cloumnsize1"));
		System.out.println(testing.getText());
		
		//example relative xpath
		//syntax = //tagname[@attribute='value']
		
		//contains xpath
		//syntax = //*[contains(@atribute,'value')]
		
		//using AND and OR
		//AND-both condition must be true
		//OR-either one condition must be true
		
		//starts with
		//syntax = //*[strats-with(@attribute,'value')]

		//text method
		//syntax = //tagname[text()='String']
	}

}
