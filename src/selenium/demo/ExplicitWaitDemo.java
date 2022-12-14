package selenium.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wdw= new WebDriverWait(driver, Duration.ofSeconds(7));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
       WebElement we= driver.findElement(By.tagName("select"));
       Select select=new Select(we);
       select.selectByVisibleText("Teacher");
       
     
       driver.findElement(By.id("terms")).click();
       driver.findElement(By.id("signInBtn")).click();
       
       wdw.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

       List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

       for(int i =0;i<products.size();i++)

       {

       products.get(i).click();

       }

       driver.findElement(By.partialLinkText("Checkout")).click();}


}

