package Mindtree.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSignUp02 {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#spree_user_email")).click();
		driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("rajeshzambare7@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("Rajesh@12345");
		
		driver.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
