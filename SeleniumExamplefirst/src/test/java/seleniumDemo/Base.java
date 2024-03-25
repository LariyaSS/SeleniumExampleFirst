package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;

	public void initialize() {
		driver = new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}

	public void browserQuit() {
		//driver.close();
		  driver.quit();

	}

	public static void main(String[] args) {
		Base base = new Base();
		base.initialize();
		base.browserQuit();

	}

}
