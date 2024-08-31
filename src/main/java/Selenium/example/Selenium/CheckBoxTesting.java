package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.cssSelector("input[id^='check']")).click();
        driver.findElement(By.cssSelector("input#checkbox-2")).click();
        driver.findElement(By.xpath("//input[contains(@id,\"checkbox-3\")]")).click();
        
	}

}
