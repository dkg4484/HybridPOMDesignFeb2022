package com.web.open.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.open.utils.ElementUtils;

// Page Object Model --> PageFactory / Plain

public class LoginPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

//	Encapsulation

	// 1. Private By locators

	private By user = By.name("email");
	private By pass = By.id("input-password");
	private By login = By.xpath("//input[@value='Login']");
	private By forgotLink = By.xpath("(//a[text()='Forgotten Password'])[1]");
	private By loginLinks = By.xpath("//div[@class='list-group']/a");
	private By footerLinks = By.xpath("(//div[@class='row'])[last()]//ul/li/a");

	// 2. Constructor --> To initialize the driver.

	public LoginPage(WebDriver driver) { // Parameterized Constructor
		this.driver = driver; // To differential local and global variable
		// To access the current instance variable
		elementUtils = new ElementUtils(this.driver);

	}

	// 3. Page Actions

	public String getLoginPageTitle() {
		return elementUtils.getPageTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return elementUtils.checkElementVisibility(forgotLink);
	}

	public void doLogin(String un, String pwd) {

		elementUtils.doSendKeys(user, un);
		elementUtils.doSendKeys(pass, pwd);
		elementUtils.doClick(login);
	}

	public List<String> getLoginLinks() {

		return elementUtils.getElementsText(loginLinks);

	}

	public List<String> getFooterLinks() {

		return elementUtils.getElementsText(footerLinks);

	}

}
