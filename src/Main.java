import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver(); //create an instance of webdriver
		
		driver.navigate().to("https://www.bnz.co.nz/contact/email"); //Navigate to address
		
		driver.findElement(By.name("details")).sendKeys("This is details field"); 
		
		driver.findElement(By.name("firstName")).sendKeys("This is First name field");
		
		driver.findElement(By.name("lastName")).sendKeys("This is Last name field");
		
		driver.findElement(By.name("email")).sendKeys("This is email field");
		
		driver.findElement(By.name("daytimePhoneNumber")).sendKeys("This is daytime PhoneNumber field");
		
		driver.findElement(By.name("yourMostConvenientStore")).sendKeys("This is your Most Convenient Store field");
		
		driver.findElement(By.className("submit")).click();		
		
		driver.close();
	}

}
