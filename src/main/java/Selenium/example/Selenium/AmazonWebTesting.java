/* a */
package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.joran.action.Action;

@SpringBootApplication
public class AmazonWebTesting {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(AmazonWebTesting.class, args);
//		System.setProperty("webdriver.chrome.driver","E:\\SelemiumProject\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        WebElement elementToHover=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions action=new Actions(driver);
        action.moveToElement(elementToHover).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(@class,\"nav-action-inner\")]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).sendKeys("19311a12c6@sreenidhi.edu.in");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("S@t26-26");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("alba botanica");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Very Emollient Body Lotion, Unscented Original, 32 Oz')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("nav-cart-count")).click();
        driver.findElement(By.className("a-button-input")).click();
        driver.quit();
        
        }

}