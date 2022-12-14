package selenium.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParentToChildPageAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> childeWindow=driver.getWindowHandles();
		Iterator<String> itr=childeWindow.iterator();//parent,child,other child.
		String parent=itr.next();
		String child=itr.next();
		//this will switch your parent window into the child window and give the control to the child window.
		driver.switchTo().window(child);
		

		String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];	
		
		//this will switch your child window into the parent window and give the controlKapse@1234594K to the parent window.
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(emailId);

		

		


	}

}
