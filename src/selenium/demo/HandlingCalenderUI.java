package selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,900)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [@id='form-field-travel_comp_date']")).click();
		
		while(!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().equalsIgnoreCase("March")) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}
		Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.cssSelector(".flatpickr-day"));
		
		int count= driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i=1;i<=count;i++) {
			String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
	}

}
