package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {

	public void verifyWhetherTheSingleCheCheckboxUnselected() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean isSingleCheckBoxSelected = singleCheckbox.isSelected();
		if (!isSingleCheckBoxSelected) {
			System.out.println("Checkbox is unchecked");
		} else {
			System.out.println("Checkbox is checked");
		}

	}

	public void verifySingleCheckBoxDemo() {

		WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//singleCheckbox.click();
		boolean isSingleCheckBoxSelected = singleCheckbox.isSelected();
		if (!isSingleCheckBoxSelected) {
			//System.out.println("Checkbox is unchecked");
			singleCheckbox.click();
		}
		if (singleCheckbox.isSelected()) {

			singleCheckbox.click();
			System.out.println("Checkbox is unchecked");
		} else {
			System.out.println("Checkbox  is already deselected");
		}

	}
	public void verifyWhetherMultipleCheckboxUnselected() {
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBox1Selected = checkBox1.isSelected();
		boolean isCheckBox2Selected = checkBox2.isSelected();
		boolean isCheckBox3Selected = checkBox3.isSelected();
		boolean isCheckBox4Selected = checkBox4.isSelected();
		if ((!isCheckBox1Selected) && (!isCheckBox2Selected) && (!isCheckBox3Selected) && (!isCheckBox4Selected)) {
			System.out.println("All Checkboxes are unchecked");
		}
		else
			System.out.println("All Checkboxes are checked");
	}

	public void multipleCheckBoxDemo() {
		String expectedSelectAllButtonTextResult = "Select All";
		String expectedUnSelectAllButtonTextResult = "Unselect All";
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean isCheckBox1Selected = checkBox1.isSelected();
		boolean isCheckBox2Selected = checkBox2.isSelected();
		boolean isCheckBox3Selected = checkBox3.isSelected();
		boolean isCheckBox4Selected = checkBox4.isSelected();
		if ((!isCheckBox1Selected) && (!isCheckBox2Selected) && (!isCheckBox3Selected) && (!isCheckBox4Selected)) {
			System.out.println("All Checkboxes are unchecked");
			selectAllButton.click();
		}
		if ((checkBox1.isSelected()) && (checkBox2.isSelected()) && (checkBox3.isSelected())
				&& (checkBox4.isSelected())) {
			selectAllButton.click();
			checkBox1.click();
			if ((checkBox1.isSelected()) && (!isCheckBox2Selected) && (!isCheckBox3Selected)
					&& (!isCheckBox4Selected)) {
				selectAllButton.click();
				if ((checkBox1.isSelected()) && (checkBox2.isSelected()) && (checkBox3.isSelected())
						&& (checkBox4.isSelected())) {
					selectAllButton.click();
					System.out.println("All Checkboxes are unchecked");
					if ((!checkBox1.isSelected())
							|| (!checkBox2.isSelected() || (!checkBox3.isSelected() || (!checkBox4.isSelected())))) {
						checkBox1.click();
						checkBox2.click();
						checkBox3.click();
						checkBox4.click();
						selectAllButton.click();

					} else {
						checkBox1.click();
						checkBox2.click();
						checkBox3.click();
						checkBox4.click();
					}
				}
			}

		}

	}

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.initialize();
		checkBox.verifyWhetherTheSingleCheCheckboxUnselected();
		checkBox.verifySingleCheckBoxDemo();
		checkBox.verifyWhetherMultipleCheckboxUnselected();
		checkBox.multipleCheckBoxDemo();
		checkBox.browserQuit();

	}

}
