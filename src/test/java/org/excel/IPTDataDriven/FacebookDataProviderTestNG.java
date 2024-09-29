package org.excel.IPTDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookDataProviderTestNG {

	
	@Test(dataProvider = "facebookCred")
	public static void invoke(String em,String pas) {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTDataDriven\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);
		System.out.println(em);
		
		driver.findElement(By.id("pass")).sendKeys(pas);
		System.out.println(pas);
		
		
		
		
	}
	
	@DataProvider(name="facebookCred")
	public Object[][] fbCred() {
		return new Object[][] {
				{"selvin@gmail.com","dshfgdsgjfs"},{"selvinkumar@gmail.com","dshfgdsgjfs"},{"selvinsushil@gmail.com","dshfgdsgjfs"}
		};
	}	
}