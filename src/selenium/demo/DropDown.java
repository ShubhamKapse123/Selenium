package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
//this demo for static dropdown
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement we=wb.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropdown= new Select(we);
		staticDropdown.selectByIndex(2);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByVisibleText("USD");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
	}

}
