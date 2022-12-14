package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wb.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wb.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(1000);
		wb.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();
	
		Thread.sleep(1000);
		wb.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
		
	}

}
