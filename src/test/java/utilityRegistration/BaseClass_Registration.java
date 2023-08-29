package utilityRegistration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass_Registration {
	
	public static Properties regis_prop;
	public static WebDriver driver;
	
public BaseClass_Registration() {
	
try {
	FileInputStream	files = new FileInputStream( System.getProperty("user.dir")+"\\src\\test\\java\\com\\Registration\\config\\com.Registration.Properties");
	
	regis_prop = new Properties();
	
	regis_prop.load(files);
	
} catch (FileNotFoundException e) {
	
	System.out.println("Please check your constructor");
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace();
}
}

public void regisbrowserinit() {
	
	String regisBrowser=regis_prop.getProperty("Browser1");
	
	if(regisBrowser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\webDriver_Registration\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData_Registration.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData_Registration.pageLoadwait));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		}
	else if(regisBrowser.equalsIgnoreCase("FireFox")) {
		
		
	}
}
 public static void registrationLaunchURL(String URL) {
	 
	 driver.get(regis_prop.getProperty("URL"));
 }



}
