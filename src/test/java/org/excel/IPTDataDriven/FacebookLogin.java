package org.excel.IPTDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.ss.usermodel.CellType;

public class FacebookLogin {
	public static void main(String[] args) throws IOException {

//		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTDataDriven\\Driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");

		List<Object> username = new ArrayList<Object>();

		File f = new File("D:\\Selenium2024\\IPTDataDriven\\Utils\\facebook.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);

		int rowsize = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {

			Row row = sheet.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j <= 0; j++) {
				Cell cell = row.getCell(1);
				if (cell.getCellType().equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
//					System.out.print(" "+stringCellValue);
					username.add(stringCellValue);

				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
//					System.out.print(" "+numericCellValue);
				}
			}
		}
		for (int i = 0; i <username.size(); i++) {
			System.out.println(username.get(i));
		}
		
	
		sheet.getRow(0).getCell(0).setCellValue("email");
		FileOutputStream fos=new FileOutputStream(f) ;
		wb.write(fos);
			
		
		
	}
}
