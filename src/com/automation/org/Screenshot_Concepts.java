package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concepts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signin = driver.findElement(By.xpath("(//div[@dir='auto'])[3]"));
		signin.click();
		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Vicky");

		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("7401320870");

	}
}
