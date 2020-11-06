package facebookSignUpAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbSignUp extends FbEnvSetUp {

	private FbSignUpFunctions objFbSignUpFunctions;

	private By drpLocator = By.id("month");

	@BeforeClass
	public void initializeWbebEnvironment() {

		objFbSignUpFunctions = new FbSignUpFunctions(this);

		initializeWbebEnv();
	}

	@Test(alwaysRun = true)
	public void registrationFcebook() {

		objFbSignUpFunctions.verifyFaceBookTitle();

		objFbSignUpFunctions.setFirstName("vaibhav");

		objFbSignUpFunctions.setLastName("Raut");

		objFbSignUpFunctions.setMobileOrEmail(objFbSignUpFunctions.setMobileOrEmail("strMobileNumber"));

		objFbSignUpFunctions.setpassword("A@1234");

		objFbSignUpFunctions.setDateOfBirthDropDown("4");
		
		objFbSignUpFunctions.setMonthInDropdown(FbUtility.getRandomMonthInCalender());

		objFbSignUpFunctions.setYearInDropDown(11);

		objFbSignUpFunctions.setGenderRadoiButton();

		driver.close();
	}

}
