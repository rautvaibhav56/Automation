package facebookSignUpAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FbSignUpFunctions {

	private FbEnvSetUp objEnvSetUp;
    
	private By drpLocator1=By.id("month");


	public FbSignUpFunctions(FbEnvSetUp fbenvSetUp) {

		this.objEnvSetUp = fbenvSetUp;
	}

	public void verifyFaceBookTitle() {

		String title = objEnvSetUp.getdriver().getTitle();

		Assert.assertEquals(title, "Sign up for Facebook | Facebook");
		objEnvSetUp.getdriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void setFirstName(String strFirstName) {

		WebElement username = objEnvSetUp.getdriver().findElement(By.name("firstname"));

		username.sendKeys(strFirstName);

	}

	public void setLastName(String strLastName) {

		WebElement surname = objEnvSetUp.getdriver().findElement(By.name("lastname"));

		surname.sendKeys(strLastName);

	}

	
	public String setMobileOrEmail(String strMobileNumber) {

		double randomDouble = Math.random();
		randomDouble = randomDouble * 99999 + 100;
		int randomInt = (int) randomDouble;
		strMobileNumber = Integer.toString(randomInt);
		objEnvSetUp.getdriver().findElement(By.name("reg_email__")).sendKeys(strMobileNumber);

		return strMobileNumber;

	}

	public void setpassword(String strPassword) {

		WebElement password = objEnvSetUp.getdriver().findElement(By.name("reg_passwd__"));

		password.sendKeys(strPassword);
	}

	

	 public void setDateOfBirthDropDown(String drpOptions) {
			WebElement element = objEnvSetUp.getdriver().findElement(By.id("day"));
			FbUtility.selectDropDown(element, drpOptions);
		}

		public void setDateOfMonthDropDown(int index) {
			WebElement dropdownmonth = objEnvSetUp.getdriver().findElement(By.id("month"));
			FbUtility.selectDropDownOfMonth(dropdownmonth, index);
			
		}
	
		public void setMonthInDropdown(String drpOptions){
			WebElement element=objEnvSetUp.getdriver().findElement(By.id("month"));
			FbUtility.selectDropDown(element,drpOptions );
			
		}
		

	public void setYearInDropDown(int year) {

		List<WebElement> yearData = objEnvSetUp.getdriver().findElements(By.xpath("//option[contains(@value,'20')]"));

		yearData.get(year).click();
	}

	public void setGenderRadoiButton() {

		WebElement radiobtn = objEnvSetUp.getdriver().findElement(By.name("sex"));

		radiobtn.click();

		// objEnvSetUp.getdriver().findElement(By.name("websubmit")).click();

	}

}
