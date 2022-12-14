package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in");
		Actions act= new Actions(driver);
		WebElement we= driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		
		//click and enter the value in specific search input field so some process like using keyboard shift pressing 
		//we make capital letter  same process will do this keyDown and make letter capital and doubleClick help the select 
		//input word that we are puts in search box.
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("oven").doubleClick().build().perform();

		//Move to the specific element and right click on browser window and option the new window that have the browsers setting options
		act.moveToElement(we).contextClick().build().perform();
	}

}
