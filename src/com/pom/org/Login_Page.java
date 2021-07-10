package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	// Eg ==> WebElement username = driver.findElement(By.id(""));

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2; // Assign to the driver
		PageFactory.initElements(driver2, this); // Initialize the WebElement
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
