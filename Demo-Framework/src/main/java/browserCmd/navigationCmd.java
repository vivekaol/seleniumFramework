package browserCmd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCmd {

	public static void main(String[] args) {

		String driverPath = "C:\\Users\\vivek\\softwares\\selenium-java-4.31.0\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String URL = "https://demoqa.com/";
		driver.get(URL);
		String nUrl = "https://demoqa.com/books";
		driver.navigate().to(nUrl);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().refresh();		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		//driver.close();
		driver.quit();
			
	}

}
