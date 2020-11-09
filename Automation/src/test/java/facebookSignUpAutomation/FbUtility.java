package facebookSignUpAutomation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FbUtility {

	public static void selectDropDown(WebElement ele, String strDropDownOption) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(strDropDownOption);

	}

	public static void selectDropDownOfMonth(WebElement ele, int index) {

		String[] arr = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Select select = new Select(ele);

		List<WebElement> alloption = select.getOptions();

		for (WebElement we : alloption) {

			for (int j = 1; j < arr.length; j++) {

				if (we.getText().equals(arr[j])) {

					String alldropdown = we.getText();

					alloption.get(index).click();
				}

			}

		}
	}
	public static String getRandomMonthInCalender() {
		Random random = new Random();
		String randomMonth = "";
		List<String> givenlist = Arrays.asList("Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
				"Oct", "Nov", "Dec");

		int numberofElement = 12;
		for (int i = 0; i < numberofElement; i++) {
			int randomIndex = random.nextInt(givenlist.size());
			randomMonth = givenlist.get(randomIndex);
		}

		return randomMonth;
	}
	


}
