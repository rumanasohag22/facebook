package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	Sheet sh;
	
	public ExcelRead(String filename,String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
	}


	public Object[][] excelToArray() {

		Object[][] t;

		// totalrows
		int totalRows = sh.getPhysicalNumberOfRows();

		// toalcols

		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();

		t = new Object[totalRows - 1][totalCols];

		for (int row = 1; row < totalRows; row = row + 1) {

			for (int col = 0; col < totalCols; col = col + 1) {

				//read excel cell data and store into array
				t[row-1][col] = getCellData(row,col);
			}

		}
		return t;
	}

	public String getCellData(int row, int col) {

		Cell c = sh.getRow(row).getCell(col);
		String v = "";

		if (c.getCellType() == Cell.CELL_TYPE_STRING) {
			// string
			v = c.getStringCellValue();

		} else {

			// numeric part
			if (c.getNumericCellValue() % 1 == 0) {
				// int
				v = "" + (int) c.getNumericCellValue();

			} else {
				// double
				v = "" + c.getNumericCellValue();

			}

		}

		return v;

	}

}
