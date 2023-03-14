package com.qa.checkin;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckIn {
	
	@Parameters({"url","username","password"})
	@Test(priority=1)
	public void BCheckIn1(String url, String uname, String Pass)
	{
		System.out.println("CheckIn1");
		System.out.println("url value is"+url);
		System.out.println("username value is"+uname);
		System.out.println("Password value is"+Pass);
	}
	
	@Test(enabled=false)
	public void CCheckIn2()
	{
		System.out.println("CheckIn2");
	}
	
	@Test(priority=2)
	public void ACheckIn3()
	{
		System.out.println("CheckIn3");
	}

}
