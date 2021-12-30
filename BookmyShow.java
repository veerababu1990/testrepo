//package Automation.Seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.findElement(By.xpath("//*[@height=\"14px\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login / Register')]")).click();
		// this is the change branch VEERA//driver.findElement(By.xpath("//label[contains(text(),'Continue with mobile number')]")).click();
		driver.findElement(By.xpath("//input[@id=\"mobileNo\"]")).sendKeys("8074534449");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		//Successfully automated this script till we have got one time password.
		//Alert al = driver.switchTo().alert();
		//al.accept();
		//driver.findElement(By.name("wzrk-cancel")).click();
	}
	}
