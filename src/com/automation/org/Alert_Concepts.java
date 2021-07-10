package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement simplerAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simplerAlert.click();
		Thread.sleep(2000);

		//Simple Alert
		driver.switchTo().alert().accept();

		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert.click();
		Thread.sleep(2000);

		WebElement confirmAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmAlert.click();
		Thread.sleep(2000);

		//Confirm Alert
		driver.switchTo().alert().dismiss();

		WebElement textBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		textBox.click();
		Thread.sleep(2000);

		WebElement promptAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptAlert.click();
		Thread.sleep(2000);

		//Prompt Alert
		driver.switchTo().alert().sendKeys("Good Nun");
		driver.switchTo().alert().accept();

	}

}
