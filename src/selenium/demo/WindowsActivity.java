package selenium.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		wd.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.navigate().back();
			
		//for the window of browser maximize mode  and navigating to the site on chrome
		
	}

}
