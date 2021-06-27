package basicprogams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshotdemo {
  
	/*first call the interface then typecast it or map with driver then take file class take its object to store file by getscreenshot method 
	output type as 'file'.then take fileutils class to copy file by copyfile method by entering sourse and destination(new file path).*/
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot)driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\user\\eclipse-workspace\\toolsqa\\src\\"+timestamp()+".jpeg"));
	    
	    }

	    private static String timestamp() {
		String timestamp = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
		return timestamp;
		
	    }
	    
 }


