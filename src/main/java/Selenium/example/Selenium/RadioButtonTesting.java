package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");  // using different locater with different method
        driver.findElement(By.cssSelector("#radio-button-1")).click();// using id wth cssSelector method
        driver.findElement(By.cssSelector("input[value='option2']")).click(); // using value type here with css Selector
        driver.findElement(By.xpath("/html/body/div/div[3]/input")).click(); // using xpath here
        driver.findElement(By.cssSelector(".form-check-input")).click(); //using class with dot
        driver.findElement(By.cssSelector("input#radio-button-1")).click(); //using id with tag
        driver.findElement(By.cssSelector("input[value$='ion2']")).click();  //using perfix(^) with css selector
	}

}
