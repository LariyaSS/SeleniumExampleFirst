package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	public void singleInputField() {

		String input = "abc";
		String expectedMessage = "Your Message : " + input;
		WebElement enterMessageTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourMessage.getText();

		if (expectedMessage.equals(yourmessageText)) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Testcase failed");
		}

	}

	public void twoInputFields() {
		int inputA = 10, inputB = 20;
		int inputSum=inputA+inputB;
		String expectedTotalResult="Total A + B : "  + inputSum;
		WebElement enterValueATextField = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueATextField.sendKeys(String.valueOf(inputA));
		WebElement enterValueBTextField = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueBTextField.sendKeys(String.valueOf(inputB));
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		getTotalButton.click();
		WebElement totalAB = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalABText = totalAB.getText();
		
		if (expectedTotalResult.equals(totalABText)) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Testcase failed");
		}
		
	}

	public static void main(String[] args) {

		WebElementCommands webelmentcommands = new WebElementCommands();
		webelmentcommands.initialize();
		webelmentcommands.singleInputField();
	    webelmentcommands.twoInputFields();
		webelmentcommands.browserQuit();

	}

}
