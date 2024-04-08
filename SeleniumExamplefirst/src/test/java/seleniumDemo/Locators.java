package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void webElementCommands() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement radiobutton = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partiallink = driver.findElement(By.partialLinkText("Radio Buttons "));
		WebElement nameexample = driver.findElement(By.name("keywords"));
		WebElement tagname = driver.findElement(By.tagName("div"));
		WebElement combination = driver.findElement(By.cssSelector("button#button-one")); /* tag+id */
		WebElement combinationdivclass = driver.findElement(By.cssSelector("div.header-top")); /*tag+class*/
		WebElement combination3 = driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
		
		//linkText
		WebElement singleform=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkbox=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement selectinput=driver.findElement(By.linkText("Select Input"));
		WebElement formsubmit=driver.findElement(By.linkText("Form Submit"));
		WebElement ajaxform=driver.findElement(By.linkText("Ajax Form Submit"));
		//xpath
		WebElement xpathelement=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpathexample=driver.findElement(By.xpath("//button[@id='button-two']"));
	    WebElement xpathtext=driver.findElement(By.xpath("//button[text()='Show Message']"));
	    WebElement xpathcomtextandid=driver.findElement(By.xpath("//button[@id='button-one' and text()='Show Message']"));
	    WebElement xpathcomtextorid=driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
	

	    //xpath with single id
	    WebElement togglericon=driver.findElement(By.xpath("//button[@type='button']"));
	    WebElement entervalue=driver.findElement(By.xpath("//input[@id='value-b']"));
	    WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
	    
	    //xpath contains
	    
	    WebElement message=driver.findElement(By.xpath("//input[contains(@placeholder,'Mes')]"));
	    WebElement messageid=driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));
	    WebElement showmsgid=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	    
	    //xpath starts-with
	    WebElement startsshowmsg=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement startsgettotal=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
        WebElement startstotal=driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
        
        //textof
        
        WebElement textofexample=driver.findElement(By.xpath("//button[text()='Show Message']"));
        WebElement textofgettotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
        WebElement textofentermsg=driver.findElement(By.xpath("//label[text()='Enter Message']"));
        
        
        //xpath and
        WebElement xpathtextandidgettotal=driver.findElement(By.xpath("//button[@id='button-two' and text()='Get Total']"));
        WebElement entermsg=driver.findElement(By.xpath("//label[@for='inputEmail4' and text()='Enter Message']"));
        
        
        
        //xpath or
        WebElement xpathtextoridgettotal=driver.findElement(By.xpath("//button[@id='button-two' or text()='Get Total']"));
        WebElement xpathentermsg=driver.findElement(By.xpath("//label[@for='inputEmail4' or text()='Enter Message']"));
        
        
        
        //partial linktext
        WebElement simpleform=driver.findElement(By.partialLinkText("Simple Form"));
        WebElement partialchkbox=driver.findElement(By.partialLinkText("Checkbox Demo"));
        WebElement partialselectinput=driver.findElement(By.partialLinkText("Select Inp"));
        WebElement partialajax=driver.findElement(By.partialLinkText("Ajax Form Sub"));
        WebElement partialjquery=driver.findElement(By.partialLinkText("Jquery Sele"));
        
        //name
        WebElement authorexmple = driver.findElement(By.name("author"));
        WebElement desexmple = driver.findElement(By.name("description"));
        WebElement viewportexmple = driver.findElement(By.name("viewport"));
        
        //tagname
        WebElement inputeg = driver.findElement(By.tagName("input"));
        WebElement btn = driver.findElement(By.tagName("button"));
        WebElement lbl = driver.findElement(By.tagName("label"));
        WebElement lieg = driver.findElement(By.tagName("li"));
        WebElement aeg = driver.findElement(By.tagName("a"));
        
        //cssselector
        
    	WebElement comtagid = driver.findElement(By.cssSelector("button#button-two")); /* tag+id */
    	WebElement comdivid=driver.findElement(By.cssSelector("div#message-two"));
    	WebElement comdiv2id=driver.findElement(By.cssSelector("div#message-one"));
    	WebElement comaid=driver.findElement(By.cssSelector("a#progress-bars"));
    	WebElement alerts=driver.findElement(By.cssSelector("a#alert-modal"));
    	
    	//cssselector tag+class
    	
    	WebElement combulclass = driver.findElement(By.cssSelector("ul.navbar-nav"));
    	WebElement combspan=driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
    	WebElement combnavbar=driver.findElement(By.cssSelector("a.navbar-brand"));
    	WebElement combtoggler=driver.findElement(By.cssSelector("button.navbar-toggler"));
    	
    	//tagname anyattribute
    	
    	WebElement combination3a = driver.findElement(By.cssSelector("a[href='drag-drop.php']"));
    	WebElement comd4=driver.findElement(By.cssSelector("a[href='bootstrap-dual-list.php']"));
    	WebElement comb5=driver.findElement(By.cssSelector("a[href='bootstrap-alert.php']"));
    	WebElement comb6=driver.findElement(By.cssSelector("a[href='jquery-progress-bar.php']"));
    	WebElement comb7=driver.findElement(By.cssSelector("a[href='table-pagination.php']"));
    	
    	//parent teq
    	
    	WebElement parentteq=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
    	//child
    	WebElement childteq=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
    	//following
    	WebElement follow=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
    	//preceding 
    	WebElement proceeding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
    	
    	//ancestor
    	
    	WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
    	//descendant
    	
    	WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::a[@id='alert-modal']"));
    	
    	//Parent technique
    	WebElement toplogo=driver.findElement(By.xpath("//a[@href='index.php']//parent::div"));
    	WebElement gettotalparent=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
    	WebElement totalparent=driver.findElement(By.xpath("//div[@id='message-two']//parent::form"));
    	
    	//child technique
    	WebElement ulchild=driver.findElement(By.xpath("//section[@class='clearfix']//child::ul"));
    	WebElement cardul=driver.findElement(By.xpath("//div[@class='card']//child::ul"));
    	WebElement navchild=driver.findElement(By.xpath("//div[@class='row']//child::nav"));
    	
    	//following technique
    	WebElement gettotalfoll=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
    	WebElement labelfoll=driver.findElement(By.xpath("//label[@for='inputEmail4']//following::input[@id='single-input-field']"));
    	WebElement linkfoll=driver.findElement(By.xpath("//link[@rel='canonical']//following::meta[@name='description']"));
    	
    	//preceding technique
    	WebElement precedingyourmsg=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']"));
    	WebElement precedinggettotal=driver.findElement(By.xpath("//div[@id='message-two']//preceding::button[@id='button-two']"));
    	WebElement precedingentrmsg=driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::label[@for='inputEmail4']"));
    	
    	//ancestor technique
    	WebElement ancestorexmp1=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']"));
    	WebElement ancestorexmp2=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
    	WebElement ancestorexmp3=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form[@method='POST']"));
    	
    	//descendant technique
    	
            
    	WebElement descendantexmp1=driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@id='message-two']"));
    	WebElement descendantexmp2=driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='row']"));
    	WebElement descendantexmp3=driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='container']"));
	}

	public static void main(String[] args) {

		Locators webelementscommand = new Locators();
		webelementscommand.initialize();
		webelementscommand.webElementCommands();
		webelementscommand.browserQuit();
	}

}
