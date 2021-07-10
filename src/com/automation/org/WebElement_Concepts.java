package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.org.Base_Class;

public class WebElement_Concepts extends Base_Class{

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		enabled(driver.findElement(By.xpath("(//div[@dir='auto'])[3]")));
		
		WebElement sigin = driver.findElement(By.xpath("(//div[@dir='auto'])[3]"));
		sigin.click();
	}

}
