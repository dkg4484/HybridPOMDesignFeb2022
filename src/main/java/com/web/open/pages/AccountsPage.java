package com.web.open.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.open.utils.ElementUtils;

public class AccountsPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	private By accSections = By.cssSelector("div#content>h2");
	private By header = By.cssSelector("div#logo>h1>a");
	private By logOutLink = By.xpath("(//a[text()='Logout'])[last()]");
	private By searchBox = By.xpath("//input[@name='search']");
	private By searchButton = By.xpath("//input[@name='search']/following-sibling::span/button");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}

	public String getAccountPageTitle() {

		return elementUtils.getPageTitle();
	}

	public String getAccountPageUrl() {
		return elementUtils.getPageUrl();
	}

	public List<String> getAccountSectionsList() {

		return elementUtils.getElementsText(accSections);

	}

	public boolean isLogOutExist() {

		return elementUtils.checkElementVisibility(logOutLink);
	}

	public String getHeaderText() {

		return elementUtils.getElementText(header);
	}

	public void clickLogout() {

		elementUtils.doClick(logOutLink);

	}

	public void searchProduct(String productName) {

		elementUtils.doSendKeys(searchBox, productName);
		elementUtils.doClick(searchButton);
	}

}
