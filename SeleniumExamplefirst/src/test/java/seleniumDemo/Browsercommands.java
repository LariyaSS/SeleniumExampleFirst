package seleniumDemo;

public class Browsercommands extends Base {

	public void browserCommands() {
		String Title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pagesource = driver.getPageSource();
	}

	public void navigationCommands() {
		driver.navigate().to("https://www.github.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Browsercommands browsercommands = new Browsercommands();
		browsercommands.initialize();
		browsercommands.navigationCommands();
		// browsercommands.browserCommands();
		browsercommands.browserQuit();

	}

}
