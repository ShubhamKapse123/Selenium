package selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitCode {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}

}
