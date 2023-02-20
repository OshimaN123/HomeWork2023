package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	WebDriver driver;
@Before
public void init() {
	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/billing/?ng=dashboard/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
@Test
public void TestLocator() {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
	driver.findElement(By.linkText("New Account")).click();
	driver.findElement(By.id("account")).sendKeys("Maisha");
	driver.findElement(By.name("description")).sendKeys("xyz");
	driver.findElement(By.name("balance")).sendKeys("100,0000");
	driver.findElement(By.name("account_number")).sendKeys("837982749872");
	driver.findElement(By.name("contact_person")).sendKeys("Ahmed");
	driver.findElement(By.id("contact_phone")).sendKeys("340923870327");
	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
	
	
}
}
