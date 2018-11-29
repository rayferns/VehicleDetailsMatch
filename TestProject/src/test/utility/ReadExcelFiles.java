/**
 * 
 */
package test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;


public class ReadExcelFiles {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	
	public static void main(String[] args) {

		String value = getCelldata(1,2);
		 System.out.println(value);
		 String value1 = getCelldata(1,2);
		 System.out.println(value1);

	}
	public static String getCelldata(int rownum, int col) throws IOException
	{
		File files[] = directory.listFiles();
		for (File f : files) {
		   
		}
		
		fis = new FileInputStream("src\\test\\resources\\"); 
		wb = new XSSFWorkbook(fis);
		sheet =wb.getSheet("script");
		row = sheet.getRow(2);
		cell = row.getCell(2);
		return cell.getStringCellValue();
	}

}
