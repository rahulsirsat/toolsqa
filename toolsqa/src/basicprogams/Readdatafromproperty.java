package basicprogams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Readdatafromproperty {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		FileInputStream file = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\toolsqa\\src\\basicprogams\\dataforfpage.properties");
		Properties prop =new Properties();
		prop.load(file);
		
		driver.get(prop.getProperty("url"));
		driver.get(prop.getProperty("email"));

	}

}