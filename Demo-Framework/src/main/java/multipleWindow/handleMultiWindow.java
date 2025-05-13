package multipleWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultiWindow {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver");
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\softwares\\selenium-java-4.31.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");

        // Open new window by clicking the button
         driver.findElement(By.xpath("//*[contains(text(), 'Multiple Windows')]")).click();
         thread.sleep(1000);
         // Click on the new window element and read the text displayed on the window
         WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]"));    
   
         // Fetching the text using method and printing it     
         System.out.println("Element found using text: " + text.getText());
         
         driver.quit();
    }
}
