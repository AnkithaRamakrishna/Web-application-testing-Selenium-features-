package newpackage;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;

public class MaxValueinColumnDynamicTable {

	    public static void main(String[] args) throws ParseException {
	    	WebDriver wd;
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32/chromedriver.exe");
			 wd= new ChromeDriver();
			 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
			 String max;
		     double m=0,r=0;
			 
		       //No. of Columns
		        List <WebElement>  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		        System.out.println("Total No of columns are : " +col.size());
		        //No.of rows
		        List <WebElement>  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		        System.out.println("Total No of rows are : " + rows.size());
		        for (int i =0;i<rows.size();i++)
		        {    
		            max= wd.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[" + (i+1)+ "]/td[4]")).getText();
		            NumberFormat f =NumberFormat.getNumberInstance(); 
		            //System.out.println("f" +f);
		            Number num = f.parse(max);
		            //System.out.println("num" +num);

		            max = num.toString();
		            m = Double.parseDouble(max);
		            //System.out.println("m" +m);

		            if(m>r)
		             {    
		                r=m;
		             }
		        }
		        System.out.println("Maximum current price is : "+ r);
	    }
	}
