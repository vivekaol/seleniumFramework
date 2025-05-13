package browserCmd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openCloseURL {

	public static void main(String[] args) {

		String driverPath = "C:\\Users\\vivek\\softwares\\selenium-java-4.31.0\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String URL = "https://demoqa.com/browser-windows/";
		driver.get(URL);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		//driver.close();
		driver.quit();
			
	}

}
