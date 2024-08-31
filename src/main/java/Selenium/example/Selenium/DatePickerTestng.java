package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTestng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("08/06/2020"); //Sending data keyboard
        driver.findElement(By.cssSelector("#datepicker")).sendKeys(Keys.RETURN);
        
       }

}
