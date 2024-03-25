package seleniumDemo;

public class Browsercommands extends Base {
	
	public void browserCommands()
	{
	  String Title=driver.getTitle();
	}

	public static void main(String[] args) {
		Browsercommands browsercommands=new Browsercommands();
		browsercommands.initialize();
		browsercommands.browserCommands();
		browsercommands.browserQuit();

	}

}
