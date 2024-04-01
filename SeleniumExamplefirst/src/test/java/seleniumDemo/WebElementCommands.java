package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement radiobutton = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partiallink = driver.findElement(By.partialLinkText("Radio Buttons "));
		WebElement nameexample = driver.findElement(By.name("keywords"));
		WebElement tagname = driver.findElement(By.tagName("div"));
		WebElement combination = driver.findElement(By.cssSelector("button#button-one")); /* tag+id */
		WebElement combinationdivclass = driver.findElement(By.cssSelector("div.header-top"));
		WebElement combination3 = driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
		
		//linkText
		WebElement singleform=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkbox=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement selectinput=driver.findElement(By.linkText("Select Input"));
		WebElement formsubmit=driver.findElement(By.linkText("Form Submit"));
		WebElement ajaxform=driver.findElement(By.linkText("Ajax Form Submit"));
		

	}

	public static void main(String[] args) {

		WebElementCommands webelementscommand = new WebElementCommands();
		webelementscommand.initialize();
		webelementscommand.webElementCommands();
		webelementscommand.browserQuit();
	}

}
