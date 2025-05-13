package multipleWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\softwares\\selenium-java-4.31.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");

		// Open new window by clicking the button
		WebElement newtest = driver.findElement(By.id("doubleClickBtn"));

		Actions actions = new Actions(driver);
		//Thread.sleep(1000);
		// actions.contextClick()
		actions.doubleClick(newtest).perform();
		//Thread.sleep(1000);
		
		WebElement getTextDoubleClick = driver.findElement(By.id("doubleClickMessage"));
		String gettextElement = getTextDoubleClick.getText();
		if(gettextElement == "You have done a double click")
			System.out.println("Test is pass");
		driver.quit();
	}

}
