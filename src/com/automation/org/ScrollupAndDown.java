package com.automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndDown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement privacy = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", privacy);
		Thread.sleep(3000);

		WebElement enroll = driver.findElement(By.xpath("//a[text()=' Enroll Now']"));
		js.executeScript("arguments[0].scrollIntoView();", enroll);
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0 , 1000)");

	}

}
