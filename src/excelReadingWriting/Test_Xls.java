package excelReadingWriting;

import java.io.FileNotFoundException;

public class Test_Xls {

	public static void main(String[] args) throws FileNotFoundException {

		Xls_Reader xls = new Xls_Reader("G:\\Interview\\Selenium-java\\Reader.xlsx");

		String value = xls.getCellData("Test", 2, 1);

		System.out.println(value);

//		Xls_Writer write = new Xls_Writer("F:\\Girish.xlsx");
//
//		write.setCellData("Girish", 6, 1, "Hiii");

	}

}
