package org.excel.IPTDataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoblaze {
	public static WebDriver driver;

	@BeforeMethod
	public static void browser() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTDataDriven\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	
	@Test(priority=1)
	public static void log() throws InterruptedException {
		WebElement log = driver.findElement(By.id("login2"));
		log.click();
		Thread.sleep(3000);
		WebElement loguser = driver.findElement(By.id("loginusername"));
		loguser.sendKeys("selvin");
		Thread.sleep(3000);
		WebElement logpass = driver.findElement(By.id("loginpassword"));
		logpass.sendKeys("123456");
		WebElement logb = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		logb.click();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public static void mobile() throws InterruptedException {
		WebElement ph = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		ph.click();
		Thread.sleep(5000);
		WebElement addc = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		addc.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		WebElement cart = driver.findElement(By.id("cartur"));
		cart.click();
		Thread.sleep(5000);
		WebElement po = driver.findElement(By.xpath("//button[text()='Place Order']"));
		po.click();
		Thread.sleep(3000);

	}
	@Test(priority=3)
	public static void details() throws InterruptedException {
		WebElement nm = driver.findElement(By.id("name"));
		nm.sendKeys("selvin");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("country"));
		element.sendKeys("USA");
		WebElement cy = driver.findElement(By.id("city"));
		cy.sendKeys("chennai");
		WebElement cd = driver.findElement(By.id("card"));
		cd.sendKeys("1233446456647445");
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("jan");
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2026");
	}

	@Test(priority=4)
	public static void purchase() {
		WebElement purchase = driver.findElement(By.xpath("//button[text()='Purchase']"));
		purchase.click();
	}

	@AfterMethod
	public void text() {
		WebElement gettext = driver.findElement(By.xpath("//p[@class='lead text-muted ']"));
		System.out.println(gettext.getText());
	}

	@AfterClass
	public static void close() {
		driver.quit();
	}

}
