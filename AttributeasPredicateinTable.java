package newpackage;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeasPredicateinTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(By
			.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
			.getText(); 		
		System.out.println(innerText); 
		driver.quit();
	}
}
