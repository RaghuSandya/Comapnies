package SynComsInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {
	public static void main(String[] args) throws Exception {
		//File Location
		File src=new File("C:\\Users\\Baburao\\Downloads\\MyContacts.xlsx");
		
		// Input Streams
		FileInputStream fis=new FileInputStream(src);
		
		//creating work book
		XSSFWorkbook  w=new XSSFWorkbook(fis);
		//Sheet get
		XSSFSheet sheet1=w.getSheetAt(0);
		//getting roe value
		String dta0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(dta0);
		String dta1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(dta1);
	}

}
