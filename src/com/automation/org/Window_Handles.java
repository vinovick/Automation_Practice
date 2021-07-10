package com.automation.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handles {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jaisa\\eclipse-workspace\\Selenium Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement bestSeller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(bestSeller).build().perform();
		Thread.sleep(2000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
		ac.contextClick(mobiles).build().perform();
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("(//a[text()='Fashion'])[1]"));
		ac.contextClick(fashion).build().perform();
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement newReleases = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		ac.contextClick(newReleases).build().perform();
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);

		Set<String> all_id = driver.getWindowHandles();

		for (String st : all_id) {
			System.out.println(st);
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}

		String actualTitle = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String st : all_id) {
			if (driver.switchTo().window(st).getTitle().equals(actualTitle)) {
				break;
			}
		}

		driver.close();
	}
}
