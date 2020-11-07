package facebookSignUpAutomation;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEnvSetUp {

	public WebDriver driver;

	public Properties obj_Config;

	public void initializeWbebEnv() {

		loadConfigProperties();
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(obj_Config.getProperty("AUT_URL"));
	}

	public WebDriver getdriver() {
		return driver;

	}

	public void loadConfigProperties() {

		try {
			obj_Config =  new Properties();
			obj_Config.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties"));
		} catch (Exception exception) {
			
	exception.printStackTrace();
		}
	}

}
