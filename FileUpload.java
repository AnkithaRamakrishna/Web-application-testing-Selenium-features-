package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;	
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	    public static void main(String[] args) {
	        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");
	        String baseUrl = "http://demo.guru99.com/test/upload/";
	        WebDriver driver = new ChromeDriver();
	        //WebDriver driver = new FirefoxDriver();

	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\Users/Akshay/FileUploadDemo.html");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        }
	}

