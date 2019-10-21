package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {  
		String projectLocation = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajavel\\workspace\\SeleniumTestcase\\lib\\chromeDriver\\chromedriver.exe");        
		System.setProperty("webdriver.chrome.driver",projectLocation+"lib\\chromeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
	    driver.navigate().to("http://www.javatpoint.com/");
	    driver.quit();
	}
}
