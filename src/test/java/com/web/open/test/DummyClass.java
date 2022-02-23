package com.web.open.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyClass {

	public static void main(String[] args) {

		/*
		 * DriverFactory driverFactory = new DriverFactory();
		 * driverFactory.init_driver(driverFactory.init_prop());
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement ele = null;

		ele = driver.findElement(By.xpath("(//a[text()='Forgottesword'])[1]"));

		System.out.println(ele.isDisplayed());

	}

}
