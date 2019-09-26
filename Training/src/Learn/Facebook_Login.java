package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import Learn.FbLogin;

public class Facebook_Login 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(FbLogin.url);
		driver.findElement(By.name(FbLogin.nuid)).sendKeys("shukladeepa05@gmail.com");
		driver.findElement(By.name(FbLogin.npwd)).sendKeys("sdfsdfsf");
		driver.findElement(By.id(FbLogin.ilogin)).click();

	}

}
