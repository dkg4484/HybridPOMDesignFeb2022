package com.web.open.utils;

import org.openqa.selenium.WebDriver;

public class ElementUtils {

	public WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
