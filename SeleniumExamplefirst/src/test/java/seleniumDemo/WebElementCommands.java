package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		
	}

	public static void main(String[] args) {
	  
		WebElementCommands webelementscommand=new WebElementCommands();
	     webelementscommand.initialize();
	     webelementscommand.webElementCommands();
	     webelementscommand.browserQuit();
	}

}
