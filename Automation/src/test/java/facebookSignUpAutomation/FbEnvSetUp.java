package facebookSignUpAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEnvSetUp {

	public WebDriver driver;

	public void initializeWbebEnv() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php");

	}

	public WebDriver getdriver() {
		return driver;

	}

}
