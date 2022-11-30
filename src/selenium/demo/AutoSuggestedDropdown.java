package selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
	WebDriver wb= new ChromeDriver();
	wb.get("https://rahulshettyacademy.com/dropdownsPractise/");
	wb.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(3000);
	List<WebElement> suggestionDropDown=wb.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


	
	for(WebElement we:suggestionDropDown) {
		if(we.getText().equalsIgnoreCase("India")) {
			we.click();
			break;
		}
	
	}
}
}

