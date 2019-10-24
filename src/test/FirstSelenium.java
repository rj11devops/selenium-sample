package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {  
		//String projectLocation = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajavel\\workspace\\SeleniumTestcase\\src\\test\\chromedriver.exe");        
		System.setProperty("webdriver.chrome.driver","D:\\a\\1\\a\\src\\test\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
	    driver.navigate().to("http://www.javatpoint.com/");
	    driver.quit();
	}
}
