package basicprogams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoqa.com/buttons");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement doubleclick = driver.findElement(By.cssSelector("button#doubleClickBtn"));
		WebElement contexclick = driver.findElement(By.cssSelector("button#rightClickBtn"));
		WebElement dynamicclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		 
		Actions actions = new Actions(driver);
		
		actions.click(doubleclick).perform();
		actions.click(contexclick).perform();
		actions.click(dynamicclick).perform();

		driver.navigate().to("https://demoqa.com/droppable/");
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));
		actions.dragAndDrop(source, target).build().perform();
		
		driver.navigate().to("https://demoqa.com/tool-tips/");
		WebElement hoveredbtn = driver.findElement(By.cssSelector("#toolTipButton"));
		actions.moveToElement(hoveredbtn).perform();
		WebElement tooltip = driver.findElement(By.cssSelector("#buttonToolTip"));
		String a = tooltip.getText();
		System.out.println(a);
		
		WebElement tbox = driver.findElement(By.cssSelector("#toolTipTextField"));
		actions.moveToElement(tbox).perform();
		WebElement tboxtip = driver.findElement(By.cssSelector("#textFieldToolTip"));
		String b = tboxtip.getText();
		System.out.println(b);
		
		WebElement contrary = driver.findElement(By.xpath("//a[text()='Contrary']"));
		actions.moveToElement(contrary).perform();
		WebElement conttooltip = driver.findElement(By.cssSelector("#contraryTexToolTip"));
		String c = conttooltip.getText();
		System.out.println(c);
		
		WebElement last = driver.findElement(By.xpath("//a[text()='Contrary']//following::a[1]"));
		actions.moveToElement(last).perform();
		WebElement lasttooltip = driver.findElement(By.cssSelector("#sectionToolTip"));
		String d = lasttooltip.getText();
		System.out.println(d);
		
		
		}

}
