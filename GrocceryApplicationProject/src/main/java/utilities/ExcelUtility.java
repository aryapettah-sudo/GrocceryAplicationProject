package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtility {
	static FileInputStream f; // to read details from the file
	static XSSFWorkbook wb; // inbuilt class of Apache, to read details from workbook
	static XSSFSheet sh; // to read details form the sheet
	
	public static String getStringData(int a, int b,String sheet) throws IOException 
	{
		f= new FileInputStream(Constants.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet); //to get method from sheet
		XSSFRow r = sh.getRow(a); // XSSRow to read details from sheet. getRow to get details from row
		XSSFCell c = r.getCell(b); // XSSFCell is a class to get details from cell
		return c.getStringCellValue(); // to get details from string
	}
	public static String getIntegerData(int a, int b,String sheet ) throws IOException
	{
		f= new FileInputStream(Constants.TESTDATAFILE);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r= sh.getRow(a);
		XSSFCell c= r.getCell(b);
		int j=(int)c.getNumericCellValue();//type casting 
		return String.valueOf(j);//convert into value to string value(type conversion)
	}
		public static String getFloatData(int a, int b,String sheet) throws IOException
		{
			f= new FileInputStream(Constants.TESTDATAFILE);
			wb=new XSSFWorkbook(f);
			sh=wb.getSheet(sheet);
			XSSFRow r= sh.getRow(a);
			XSSFCell c= r.getCell(b);
			float j=(float)c.getNumericCellValue();//type casting 
			return String.valueOf(j);//convert into value to string value(type conversion)
        }
		
}