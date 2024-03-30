package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonExampleWeb extends Base {
	
	
	public void amazoneWebElements(){
		
		driver.get("https://www.amazon.in/");
		WebElement searchamazone=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement mobile=driver.findElement(By.className("nav-a"));
		WebElement prime=driver.findElement(By.id("nav-link-amazonprime"));
		WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
		WebElement updatelocation=driver.findElement(By.id("glow-ingress-line2"));
		WebElement amazonein=driver.findElement(By.id("nav-logo-sprites"));
	}

	public static void main(String[] args) {
	  AmazonExampleWeb amazonexampleweb=new AmazonExampleWeb();
	  amazonexampleweb.initialize();
	  amazonexampleweb.amazoneWebElements();
	  amazonexampleweb.browserQuit();

	}

}
