package basicprogams;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String MainWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup')]")).click();
			
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			String ChildWindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sirsat333@gmail.com");
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			Thread.sleep(2000);
			
			//driver.close();
			
		}
			
	 }
		driver.switchTo().window(MainWindow);
		driver.close();

   }

 }
