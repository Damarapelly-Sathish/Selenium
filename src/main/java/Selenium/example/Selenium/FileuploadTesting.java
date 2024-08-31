package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.findElement(By.cssSelector(".btn")).sendKeys("soft skill");

	}

}
