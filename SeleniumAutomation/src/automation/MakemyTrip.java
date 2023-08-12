package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakemyTrip {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		try {
			WebElement frame1 = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
			driver.switchTo().frame(frame1);
			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
			driver.switchTo().defaultContent();
		}
		catch(NoSuchElementException e) {
			
		}
		driver.findElement(By.className("menu_Buses")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Ongole");
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Sat Mar 25 2023']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("menu_Trains")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Tadepalligudem");
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Sat Mar 25 2023']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".travelForPopup li:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("menu_Flights")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Banglore");
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		try {			
			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Delhi");
		}
		catch(NoSuchElementException e) {
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("Delhi");
		}
		Thread.sleep(1000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Sat Mar 25 2023']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	

}
