package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FromAssignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
	WebDriver wb= new ChromeDriver();
	wb.get("https://rahulshettyacademy.com/angularpractice/");
	wb.findElement(By.name("name")).sendKeys("sk");
	wb.findElement(By.name("email")).sendKeys("sk@ter.com");
	wb.findElement(By.id("exampleInputPassword1")).sendKeys("43545");
	wb.findElement(By.id("exampleCheck1")).click();
	
	WebElement dropdown = wb.findElement(By.id("exampleFormControlSelect1"));
	
	Select abc = new Select(dropdown);
	abc.selectByVisibleText("Female");
	wb.findElement(By.id("inlineRadio1")).click();
	wb.findElement(By.name("bday")).sendKeys("30/11/1944");
	wb.findElement(By.cssSelector(".btn-success")).click();
	System.out.println(wb.findElement(By.cssSelector(".alert-success")).getText());
}
}
