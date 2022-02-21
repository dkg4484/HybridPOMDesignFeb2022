package com.web.open.test;

import com.web.open.factory.DriverFactory;

public class DummyClass {

	public static void main(String[] args) {

		DriverFactory driverFactory = new DriverFactory();
		driverFactory.init_driver(driverFactory.init_prop());

	}

}
