package org.excel.IPTDataDriven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngFunctions {

	@BeforeClass
	@Parameters("browser")
	public static void  methodfirst(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
		}else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("edge");
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox");
		}else {
			System.out.println("invalid browser");
		}
	}
	
	@Test(priority=2)
	public static void  method1() {
		System.out.println("1");
	}
	
	@Test(priority=4,expectedExceptions = ArithmeticException.class,groups="Regression")
	public static void  method2() {
		
		int a=1;
		int b=0;
		int c=1/0;
		System.out.println("2"+c);
	}
	@Test(priority=2,groups="Progression")
	public static void  method3() {
		System.out.println("3");
	}
	@Test(priority=1,groups="Regression")
	public static void  method5() {
		System.out.println("4");
	}
	@AfterClass
	public static void  method4() {
		System.out.println("5");
	}
	
}
