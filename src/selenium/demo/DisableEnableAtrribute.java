package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisableEnableAtrribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.get("https://rahulshettyacademy.com/dropdownsPractise/");

		wb.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//here check that the Date filed is enable or disable after clicking the radio button
		if(wb.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	
	}

}
