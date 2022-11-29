package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wb.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wb.findElement(By.xpath("//a[@value='IXB']")).click();
		//this one way to doing dynamic by index
		// wb.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		//this is another way traversal of parent and child relation 
		wb.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();
			
	}

}
