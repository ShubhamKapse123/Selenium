package selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSel {
	public static void main(String[] args) throws InterruptedException {
		//this properties set for the browser driver that on which browser you use
		//for testing.
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   //get the starting  page of website 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// select by id locator
		driver.findElement(By.id("inputUsername")).sendKeys("shubham");
		// select by Class locator
		driver.findElement(By.className("signInBtn")).click();
		// one of type of wait that implicitwait use for waiting the response of next page.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//cssselector use here 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//for <a href> tag should be there then use link text for link
		driver.findElement(By.linkText("Forgot your password?")).click();
		// use xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("myname");
		driver .findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//use cssSelector for access child element
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test");
		// use xpath access child element 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("87528562");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shubham");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//use regular expression in xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.className("logout-btn")).click();
		//close use for close the current page and quit use for close all page and close webdriver. 
		driver.close();
	}
}
