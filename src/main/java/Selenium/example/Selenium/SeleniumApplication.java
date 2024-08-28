package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SeleniumApplication.class, args);
//		System.setProperty("webdriver.chrome.driver","E:\\SelemiumProject\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.findElement(By.id("autocomplete")).sendKeys("karimnagar,Telangana,500501");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	}

}
