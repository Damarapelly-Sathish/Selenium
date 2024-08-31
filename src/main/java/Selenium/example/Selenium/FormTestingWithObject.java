package Selenium.example.Selenium;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormTestingWithObject {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Form form=new Form();
		form.data(driver);
		Waittime(driver);
}
	public static void Waittime(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement alert=wait.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert"))));
		  String alertMessage=alert.getText();
		  assertEquals("The form was successfully submitted!",alertMessage);
	  }
}
