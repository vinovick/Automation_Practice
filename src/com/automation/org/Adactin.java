package com.automation.org;

import com.baseclass.org.Base_Class;
import com.pom.org.Login_Page;

public class Adactin extends Base_Class {

	public static void main(String[] args) {
		getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");

		Login_Page lp = new Login_Page(driver);

		inputOfElement(lp.getUsername(), "vinovicky");
		inputOfElement(lp.getPassword(), "Jan@2020");
		clickOnElement(lp.getLogin());
	}

}
