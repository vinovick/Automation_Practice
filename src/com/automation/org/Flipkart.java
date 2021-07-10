package com.automation.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement mark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		mark.click();
		Thread.sleep(3000);
		WebElement searchProduct = driver.findElement(By.xpath("//input[@type='text']"));
		searchProduct.sendKeys("iphone11");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
		iphone.click();
		Thread.sleep(3000);
		Set<String> all_Id = driver.getWindowHandles();

		for (String st : all_Id) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}
		String actualTitle = "APPLE iPhone 11 ( 64 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
		for (String st : all_Id) {
			if (driver.switchTo().window(st).getTitle().equals(actualTitle)) {
				break;
			}
		}
		WebElement addcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addcart.click();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
		String text = price.getText();
		System.out.println("The price of the iphone is " + text);
	}

}
