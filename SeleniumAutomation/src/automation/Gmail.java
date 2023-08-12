package automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1460352180%3A1679561485525756&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AQMjQ7TkSuio-DSgZ16PEz_T1ERYrsNbVAUkQuGYAGi0hQO0SKyP7Poiwh7dk1RJWJKXMJFEZxWDPg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("bruce.Banner23032023@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#identifierNext > div > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("#Hulk@bruce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".Cp table tbody tr:nth-child(1)")).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(
			      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		System.out.println("Wating complete");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@gh='cm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".agP.aFw")).sendKeys("420230@student.nitandhra.ac.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@role='presentation']//input[@name='subjectbox']")).sendKeys("Selenium Automation Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Message Body'][@role='textbox']")).sendKeys("Hi from testing");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
}
