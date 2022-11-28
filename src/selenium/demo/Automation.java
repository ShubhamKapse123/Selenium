package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		
		//child traversal access element of child
		System.out.println(wd.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//parent traversal access child element 
		System.out.println(wd.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());		
		
		
		
		
	}

}
