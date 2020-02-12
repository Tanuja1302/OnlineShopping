/**
 * 
 */
package Comman_Base_Class;

import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Tanuja_belwal
 *
 */
public class Excel_Sheet_SetUp {
	String filepath="C://Users//Tanuja_belwal//workspace//TestProject//Registration_Details_New.xls";
	public String getexceldata(String sheetname, int rownum,int colnum) throws Throwable
	{
		FileInputStream fis= new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		String data= row.getCell(colnum).getStringCellValue();
		return data;
	}
	
	public void setexceldata(String Excelsheetname, String sheetname, int rownum,int colnum,String data) throws Throwable
	{
		FileInputStream fis= new FileInputStream(Excelsheetname);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cell=row.createCell(colnum);
		cell.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(Excelsheetname);
		wb.write(fos);
		wb.close();
	}
	
	
	public double getnumericvalueinexceldata(String Excelsheetname,String sheetname, int rownum,int colnum) throws Throwable
	{
		FileInputStream fis= new FileInputStream(Excelsheetname);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		double numericdata= row.getCell(colnum).getNumericCellValue();
		return numericdata; 
	}
	

}
