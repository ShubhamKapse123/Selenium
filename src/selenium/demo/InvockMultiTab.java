package selenium.demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvockMultiTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> id=driver.getWindowHandles();
		Iterator<String> itr= id.iterator();
		String parentWindow=	itr.next();
	   String childWindow=	itr.next();
	   driver.switchTo().window(childWindow);
	   driver.get("https://rahulshettyacademy.com/");
	   String text=driver.findElements(By.cssSelector("a[href*='courses']")).get(1).getText();
	   
	   driver.switchTo().window(parentWindow);
	   
	 driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys(text);
	 
	 WebElement box=  driver.findElement(By.xpath("//input[@minlength='2']"));
	 
	 //taking screen short for particular element or part
//	 File file=box.getScreenshotAs(OutputType.FILE);
//	 
//	 FileUtils.copyFile(file, new File("logo.png"));
	 
	 //Get height and width
	 
	 System.out.println(box.getRect().getDimension().getHeight());
	 System.out.println(box.getRect().getDimension().getWidth());
	  
	}
}

