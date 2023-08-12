package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practo {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.practo.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login / Signup")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("7396446757");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("#Hulk@Bruce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".remember > label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni__wrapper--locality .c-omni-searchbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni__wrapper--locality .c-omni-searchbox")).clear();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni__wrapper--locality .c-omni-searchbox")).sendKeys("Mumba");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni-suggestion-item:nth-child(1) > .c-omni-suggestion-item__content:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni__wrapper--keyword .c-omni-searchbox")).sendKeys("Derma");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".c-omni-suggestion-group:nth-child(1) > .c-omni-suggestion-item:nth-child(1) > .c-omni-suggestion-item__content")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".product-tab:nth-child(1) .product-tab__title")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".product-tab:nth-child(2) .product-tab__subtitle")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".product-tab:nth-child(4) .product-tab__subtitle")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".slick-slide:nth-child(1) .o-f-color--plight")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".slick-slide:nth-child(2) .o-f-color--plight")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

}
