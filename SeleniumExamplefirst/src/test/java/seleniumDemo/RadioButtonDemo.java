package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonDemo extends Base {

	public void verifyRadioButtonDemo() {
		//driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		maleRadioButton.click();
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		boolean statusMaleradioButton = maleRadioButton.isSelected();
		boolean statusFemaleradioButton = femaleradioButton.isSelected();
		if ((statusMaleradioButton == true) && (statusFemaleradioButton == false)) {

			femaleradioButton.click();
			showSelectedValueButton.click();
		} else
			System.out.println("Radiobutton is now Toggled off");
	}
	public void verifyWhetherTheRadioButtonsUnSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if((maleRadioButton.isSelected())||(femaleradioButton.isSelected()))
		{
			System.out.println("Radio button is selected");
			
		}
			else{ 
			  System.out.println("Radio button is not selected");
		}
	}

	public void verifyGroupRadioButtonsDemo() {
		WebElement pateintsMaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement pateintsFemaleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement pateintsAge1To18RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement pateintsAge19To44RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement pateintsAge45To60RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResultButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		pateintsMaleRadioButton.click();
		boolean isMaleradioButtonSelected = pateintsMaleRadioButton.isSelected();
		if (isMaleradioButtonSelected == true) {
			pateintsAge1To18RadioButton.click();
			pateintsAge19To44RadioButton.click();
			pateintsAge45To60RadioButton.click();
			getResultButton.click();

		} else if (!isMaleradioButtonSelected) {
			pateintsFemaleradioButton.click();
			pateintsAge1To18RadioButton.click();
			pateintsAge19To44RadioButton.click();
			pateintsAge45To60RadioButton.click();
			getResultButton.click();
		}

		pateintsFemaleradioButton.click();
		pateintsAge1To18RadioButton.click();
		pateintsAge19To44RadioButton.click();
		pateintsAge45To60RadioButton.click();
		getResultButton.click();

	}

	public static void main(String[] args) {
		RadioButtonDemo radioButtondemo = new RadioButtonDemo();
		radioButtondemo.initialize();
		radioButtondemo.verifyWhetherTheRadioButtonsUnSelected();
		radioButtondemo.verifyRadioButtonDemo();
		radioButtondemo.verifyGroupRadioButtonsDemo();
		radioButtondemo.browserQuit();

	}

}
