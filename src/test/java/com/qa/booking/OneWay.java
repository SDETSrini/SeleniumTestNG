package com.qa.booking;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qa.base.core;

public class OneWay extends core {
	
	
	@BeforeTest()
	public void beforeTestCode()
	{
		System.out.println("beforeTestCode");
//		changes has made by tarun on 18-03-2023
		System.out.println("hellow");
	}
	
	@AfterTest()
	public void AfterTest()
	{
		System.out.println("AfterTestcode");
	}
	
	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	

	@AfterMethod()
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@Test
	public void OneWay1()
	{
//		startup();
		System.out.println("OneWay1");
//		teardown();
	}
	
	@Test(groups= {"Regression"})
	public void OneWay2()
	{
//		startup();
		System.out.println("OneWay2");
//		teardown();
	}

	@Test(groups= {"Regression"})
	public void OneWay3()
	{
		System.out.println("OneWay3");
	}


	@Test(groups= {"Regression"})
	public void OneWay4()
	{
		System.out.println("OneWay4");
	}
}
