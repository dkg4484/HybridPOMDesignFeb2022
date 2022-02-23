package com.web.open.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.web.open.factory.DriverFactory;
import com.web.open.pages.AccountsPage;
import com.web.open.pages.LoginPage;

public class BaseTest {

	public DriverFactory driverFactory;
	public Properties prop;
	public WebDriver driver;
	public LoginPage loginPage;
	public AccountsPage accountsPage;

	@BeforeTest
	public void setup() {

		driverFactory = new DriverFactory();
		prop = driverFactory.init_prop();
		driver = driverFactory.init_driver(driverFactory.init_prop());
		loginPage = new LoginPage(driver);

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
