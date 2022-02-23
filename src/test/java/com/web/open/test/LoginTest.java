package com.web.open.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() { //4

		String actualTitle = loginPage.getLoginPageTitle();

		Assert.assertEquals(actualTitle, "Account Login");

	}

	@Test(priority = 2)
	public void forgotPwdLinkTest() { // 2

		boolean forgotPwdLinkExist = loginPage.isForgotPwdLinkExist();

		Assert.assertTrue(forgotPwdLinkExist);

	}

	@Test(priority = 3)
	public void loginTest() {//5

		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 4)
	public void loginLinksTest() { // 3

		int linkCount = loginPage.getLoginLinks().size();

		Assert.assertEquals(linkCount, 13);

	}

	@Test(priority = 5)
	public void footerLinksTest() { // 1

		int footerCount = loginPage.getFooterLinks().size();

		Assert.assertEquals(footerCount, 15);

		Assert.assertTrue(loginPage.getFooterLinks().contains("Brands"));

		Assert.assertTrue(loginPage.getFooterLinks().contains("Contact Us"));
	}

}
