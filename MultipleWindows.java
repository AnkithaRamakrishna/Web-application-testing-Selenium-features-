package newpackage;
import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	    public static void main(String[] args) throws InterruptedException {									
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");	
	    	//WebDriver driver=new FirefoxDriver();	
	        	WebDriver driver=new ChromeDriver();
	        		
	        //Launching the site.				
	            driver.get("http://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	                		
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	        		
	        String MainWindow=driver.getWindowHandle();
	        System.out.println("mainwindow"+MainWindow);
	        		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();	
	            System.out.println("s1"+s1);
	        Iterator<String> i1=s1.iterator();		
	        System.out.println("i1"+i1);
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();
	            System.out.println("i1"+i1);
	            System.out.println("childwindow"+ChildWindow);
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	            	Thread.sleep(5000);
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();	
	                    Thread.sleep(5000);
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);				
	    }
	}		

