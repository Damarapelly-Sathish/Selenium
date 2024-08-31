package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Form {

	public  void data(WebDriver driver) {
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Damarapelly");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Sathish");
		driver.findElement(By.cssSelector("input#job-title")).sendKeys("QA automation Testing");
		driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
		driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
		driver.findElement(By.id("select-menu")).sendKeys("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("08/20/2020");
		driver.findElement(By.cssSelector(".btn")).click();

	}

}
