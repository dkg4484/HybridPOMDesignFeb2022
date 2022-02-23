package com.web.open.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web.open.pages.AccountsPage;

public class AccountPageTest extends BaseTest {

	@BeforeClass
	public void accountPageSetUp() {
		
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		accountsPage = new AccountsPage(driver);

	}

	@Test(priority = 1)
	public void accPageTitleTest() {

		String accountPageTitle = accountsPage.getAccountPageTitle();

		Assert.assertEquals(accountPageTitle, "My Account");

	}

	@Test(priority = 2)
	public void accPageUrlTest() {

		String accountPageUrl = accountsPage.getAccountPageUrl();

		Assert.assertEquals(accountPageUrl, "https://demo.opencart.com/index.php?route=account/account");

	}

	@Test(priority = 3)
	public void logOutLinkTest() {

		boolean logOutExist = accountsPage.isLogOutExist();

		Assert.assertTrue(logOutExist);

	}

	@Test(priority = 4)
	public void accSectionTest() {

		int sectionCount = accountsPage.getAccountSectionsList().size();

		Assert.assertEquals(sectionCount, 4);

	}

	@Test(priority = 5)
	public void accHeaderTest() {

		String headerText = accountsPage.getHeaderText();

		Assert.assertEquals(headerText, "Your Store");

	}

	@Test(priority = 6)
	public void searchTest() {

		accountsPage.searchProduct("IMac");

	}

}
