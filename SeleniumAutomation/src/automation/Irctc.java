package automation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> h=new Hashtable<String, Integer>();
	    h.put("January",0 );
	    h.put("February",1);
	    h.put("March",2);
	    h.put("April",3);
	    h.put("May",4);
	    h.put("June",5);
	    h.put("July",6);
	    h.put("August",7);
	    h.put("September",8);
	    h.put("October",9);
	    h.put("November",10);
	    h.put("December",11);
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#origin > span > input")).sendKeys("Tanuku");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pr_id_1_list > li:nth-child(2) > span")).click();
		driver.findElement(By.cssSelector("#destination > span > input")).sendKeys("Visakhapatnam");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pr_id_2_list > li:nth-child(1) > span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		int year = Integer.parseInt(driver.findElement(By.cssSelector("#jDate > span > div > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all.ng-tns-c58-10 > div > span.ui-datepicker-year.ng-tns-c58-10.ng-star-inserted")).getText());
		WebElement btnleft = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[1]/span"));
		WebElement btnright = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[1]/span"));
		while(year<2023) {
			btnleft.click();
		}
		while(year>2023) {
			btnright.click();
		}
		String month = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
		String reqMonth = "March";
		while(h.get(month)>h.get(reqMonth)) {
			btnleft.click();
		}
		while(h.get(month)<h.get(reqMonth)) {
			btnright.click();
		}
		int date = 17;
		String dateSelector = String.format("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody//a[text()='%d']", date);
		driver.findElement(By.xpath(dateSelector)).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > div > form > div:nth-child(5) > div > button")).click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
