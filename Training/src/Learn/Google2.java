package Learn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google2 
{
	    WebDriver driver;
		@Test
		@Parameters({"browser"})
		
		public void search(String str) 
		{
			if(str.matches("firefox"))
			{
				driver = new FirefoxDriver();  // open a new firefox browser
			}
		    if(str.matches("chrome"))
			{
				driver = new ChromeDriver();
			}
		    
			driver.get("http://www.google.com"); //open the url
			driver.findElement(By.name("q")).sendKeys("selenium");  //type selenium in the textbox
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //press enter

	}

}
