package basicprogams;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import netscape.javascript.JSException;

public class cssSelectordemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//locators css selector using id(#)
		//tagname#idvalue or #idvalue
		
		WebElement firstname = driver.findElement(By.cssSelector("#firstName"));
		firstname.sendKeys("Rahul");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.cssSelector("#lastName"));
		lastname.sendKeys("Sirsat");
		Thread.sleep(1000);
		
        //locator css selector using attributes
		//tagname[attribute='value']
		
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		email.sendKeys("sirsat333@gmail.com");
		Thread.sleep(1000);
		//locator css selector using class name
		//tagname.classvalue or .classvalue 
		
		WebElement other = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-3']"));
		other.click();
		WebElement female = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-2']"));
		female.click();
		WebElement male = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-1']"));
		male.click();
		Thread.sleep(1000);
		
		WebElement mobilenum = driver.findElement(By.cssSelector(" input.mr-sm-2.form-control#userNumber"));
		mobilenum.sendKeys("8446475707");
		Thread.sleep(1000);
		WebElement dob = driver.findElement(By.cssSelector("#dateOfBirthInput"));
		dob.click();
		Thread.sleep(1000);
		
		//WebElement month = driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
		//month.click();
		//Thread.sleep(1000);
		
		/*Select select = new Select(driver.findElement(By.cssSelector("select.react-datepicker__month-select")));
		select.selectByIndex(3);
		Thread.sleep(1000);
		Select select1 = new Select(driver.findElement(By.cssSelector("select.react-datepicker__year-select")));
		select1.selectByValue("1986");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.cssSelector("react-datepicker__day react-datepicker__day--005 react-datepicker__day--selected react-datepicker__day--weekend"));
		day.click();
		Thread.sleep(1000);*/
		
		WebElement subjects = driver.findElement(By.cssSelector("div[class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		Actions action = new Actions(driver);
		action.click(subjects).build().perform();
		action.sendKeys(subjects,"Eng").build().perform();
		WebElement english = driver.findElement(By.xpath("//div[text()='English']"));
		english.click();
		//Js.executeScript("arguments[0].click();",english);
		Thread.sleep(1000);
		
		WebElement sports = driver.findElement(By.xpath("//label[contains(@class,'custom-control-label') and text()='Sports']"));
				                                        // input.custom-control-input#hobbies-checkbox-1
		sports.click();
		WebElement reading = driver.findElement(By.xpath("//label[contains(@class,'custom-control-label') and text()='Reading']"));
		reading.click();                                        //input.custom-control-input#hobbies-checkbox-2     
		WebElement music = driver.findElement(By.cssSelector("label.custom-control-label[for='hobbies-checkbox-3']"));
		music.click();
		Thread.sleep(1000);
		WebElement currentadress = driver.findElement(By.cssSelector("textarea.form-control#currentAddress"));
		currentadress.sendKeys("kaij");
		
		driver.findElement(By.cssSelector("img[style='vertical-align:middle']")).click();
		
		WebElement submitbtn = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
		action.moveToElement(submitbtn).build().perform();
		
		WebElement state = driver.findElement(By.cssSelector("div#state"));
		state.click();
		WebElement selectstate = driver.findElement(By.xpath("//*[contains(text(),'NCR')]"));
		selectstate.click();
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.xpath("//div[contains(@class,'css-2b097c-container') and contains(@id,'city')]//child::div//div[@class=' css-1wa3eu0-placeholder']"));
		city.click();
		driver.findElement(By.xpath("//*[contains(text(),'Delhi')]")).click();
		submitbtn.click();
		
	}

}
