package Selenium.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdownMenuButton")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/a[12]")).click();
	}

}
