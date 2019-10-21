package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajavel\\workspace\\chromedriver.exe");        
	    WebDriver driver = new ChromeDriver();  
	    driver.navigate().to("http://www.javatpoint.com/");
	    driver.quit();
	}
}
