package com.web.open.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {

	public WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	/**
	 * 
	 * @param locator
	 * @return
	 * 
	 *         To check whether element is visible or not
	 */

	public boolean checkElementVisibility(By locator) {

		return getElement(locator).isDisplayed();

	}

	public void doSendKeys(By locator, String string) {

		getElement(locator).sendKeys(string);
	}

	public void doClick(By locator) {

		getElement(locator).click();
	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public List<String> getElementsText(By locator) {

		List<WebElement> elements = getElements(locator);

		List<String> labels = new ArrayList<>();

		for (WebElement ele : elements) {

			labels.add(ele.getText());
		}

		return labels;

	}

	public String getElementText(By locator) {

		return getElement(locator).getText();
	}

}
