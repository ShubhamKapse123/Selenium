package selenium.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
     
		driver.get("https://www.ilovepdf.com/pdf_to_word");

		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec("G:\\MyData@2022-23\\Selenium\\Selenium\\target\\uploadFile.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("processTaskTextBtn")).click();

//		· Handling File Upload from Windows using AutoIT


//		What is AutoIT
//		Install AutoIT
//		AutoIT Scripting
//		Integrating AutoIT with Selenium



		//Shift focus to the file upload windows

		//set text/path into file name edit box

		//click open to upload file



//		Au3info- record window component objects
//
//		Build Script -scite.exe
//
//		Save it- .au3 extenstion
//
//		Convert file into .exe by compiling .au3 file
//
//		Call .exe file with Runtime class in java into your selenium tests
//
//
//
//
//
//		ControlFocus("Open","","Edit1")
//
//		ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")
//
//		ControlClick("Open","","Button1")


	}

}
