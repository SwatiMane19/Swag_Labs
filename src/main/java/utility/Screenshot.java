package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void shot(WebDriver driver,String name) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("G:\\JAVA\\SwagLabs\\src\\main\\resources\\SS\\"+name+DateTime.time()+".jpg");
		FileHandler.copy(source, destination);
		
		
	}

	
	

	

	
	

}
