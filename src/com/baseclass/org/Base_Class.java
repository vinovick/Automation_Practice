package com.baseclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\firefoxdriver.exe"));
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + ("\\Driver\\Edgedriver.exe"));
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String value) {
		driver.get(value);
	}

	public static void inputOfElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		element.clear();

	}

	public static void dropDown(WebElement element, String Options, String Value) {
		Select s = new Select(element);
		try {
			if (Options.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(Value);
				s.selectByIndex(parseInt);
			} else if (Options.equalsIgnoreCase("byValue")) {
				s.selectByValue(Value);
			} else if (Options.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(Value);
			} else {
				System.out.println("Invalid Selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void enabled(WebElement element) {
		System.out.println(element.isEnabled());
	}

}
