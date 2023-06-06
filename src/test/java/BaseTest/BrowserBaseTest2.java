package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BrowserBaseTest2 {
	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static Properties prop;
	public Actions act;
	
	@BeforeClass
	public void AppiumTest() throws IOException, Exception
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\RESHMA\\eclipse\\IndusindMobile\\src\\test\\java\\Resource\\config.properies");
		prop.load(fis);
		//code to start server
		
//		 service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\RESHMA\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		//appium code->appium server->mobile
		UiAutomator2Options cap=new UiAutomator2Options();
        cap.setChromedriverExecutable("C:\\Users\\RESHMA\\eclipse\\IndusindMobile\\drivers\\chromedriver.exe");
		cap.setCapability("deviceName","SM M015G");
		cap.setCapability("browserName","Chrome");

		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get(prop.getProperty("base_url"));
		 act=new Actions(driver);
	
	}

}
