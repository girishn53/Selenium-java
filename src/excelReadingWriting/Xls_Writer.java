//code to write the data in xls file

package excelReadingWriting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Writer {

	XSSFWorkbook workbook = null;

	XSSFSheet sheet = null;

	String path = "";
	
	FileInputStream fin=null;
	
	File f=null;

	public Xls_Writer(String path) {

		this.path = path;

		 f = new File(path);

		try {
			 fin = new FileInputStream(f);

			workbook = new XSSFWorkbook(fin);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void setCellData(String sheetName, int rowNum, int cellNum, String data) throws FileNotFoundException {

		sheet = workbook.getSheet(sheetName);

		XSSFRow row = null;

		XSSFCell cell = null;

		row = sheet.getRow(rowNum - 1);

		if (row == null) {

			row = sheet.createRow(rowNum - 1);

			cell = row.createCell(cellNum - 1);
			
			cell.setCellValue(data);
		}
		
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		FileOutputStream fout=new FileOutputStream(f);
		
		try {
			workbook.write(fout);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

	
	
	

}
