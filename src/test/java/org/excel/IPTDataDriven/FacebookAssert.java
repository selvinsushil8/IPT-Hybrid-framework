package org.excel.IPTDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookAssert {

	
	
	@Test
	public static void invoke() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTDataDriven\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	
		String title = driver.getTitle();
		String s="Facebook – log in or sign up";
		System.out.println(title);
		
//		Assert.assertEquals(s, title);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(s, title);
		sa.assertAll();
	}
}
