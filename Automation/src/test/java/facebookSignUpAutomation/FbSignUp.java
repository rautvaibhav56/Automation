package facebookSignUpAutomation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbSignUp extends FbEnvSetUp {

	private FbSignUpFunctions objFbSignUpFunctions;

	@BeforeClass
	public void initializeWbebEnvironment() {

		objFbSignUpFunctions = new FbSignUpFunctions(this);

		initializeWbebEnv();
	}

	@Test(alwaysRun = true)
	public void registrationFcebook() {

		objFbSignUpFunctions.verifyFaceBookTitle();

		objFbSignUpFunctions.setFirstName(obj_Config.getProperty("FirstName"));

		objFbSignUpFunctions.setLastName(obj_Config.getProperty("LastName"));

		objFbSignUpFunctions.setMobileOrEmail(objFbSignUpFunctions.setMobileOrEmail("strMobileNumber"));

		objFbSignUpFunctions.setpassword(obj_Config.getProperty("password"));

		objFbSignUpFunctions.setDateOfBirthDropDown(obj_Config.getProperty("DOB"));
		
		objFbSignUpFunctions.setMonthInDropdown(FbUtility.getRandomMonthInCalender());

		objFbSignUpFunctions.setYearInDropDown(Integer.parseInt(obj_Config.getProperty("year")));

		objFbSignUpFunctions.setGenderRadoiButton();

		driver.close();
	}

}
