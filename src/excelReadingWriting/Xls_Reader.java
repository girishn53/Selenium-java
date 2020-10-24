//Code to read the data from xls file

package excelReadingWriting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	String path = "";

	XSSFWorkbook workbook = null;

	XSSFSheet sheet = null;

	public Xls_Reader(String path) throws FileNotFoundException {

		this.path = path;

		File f = new File(path);

		FileInputStream fin = new FileInputStream(f);

		try {
			workbook = new XSSFWorkbook(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getRowCount(String sheetName) {
		sheet = workbook.getSheet(sheetName);

		int rows = (sheet.getLastRowNum() - sheet.getFirstRowNum()) + 1;

		System.out.println("Rows in the sheet are " + rows);
		return rows;
	}

	// get cell data

	public String getCellData(String sheetName, int rowNum, int cellNum) {
		String value = "";

		sheet = workbook.getSheet(sheetName);

		int rows = getRowCount(sheetName);

		for (int i = 0; i < rows; i++) {

			if (i == (rowNum - 1)) {
				XSSFRow row = sheet.getRow(i);

				value = row.getCell(cellNum - 1).getStringCellValue();
			}

		}
		return value;

	}
}
