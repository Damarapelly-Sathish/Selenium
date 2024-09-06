package Selenium.example.Selenium;

//import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FormTestingWithMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Damarapelly");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Sathish");
		driver.findElement(By.cssSelector("input#job-title")).sendKeys("QA automation Testing");
		driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
		driver.findElement(By.cssSelector("input[value='checkbox-2']")).click();
		driver.findElement(By.id("select-menu")).sendKeys("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("08/20/2020");
		driver.findElement(By.cssSelector(".btn")).click();
		Waittime(driver);
	}
  public static void Waittime(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement alert=wait.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert"))));
	  String alertMessage=alert.getText();
//	  assertEquals("The form was successfully submitted!",alertMessage);
  }
}
