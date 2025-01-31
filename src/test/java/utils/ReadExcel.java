package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData() throws IOException {
		String sheetLoc = "E:\\demo\\src\\test\\java\\utils\\datasheet.xlsx";

		// String prop = System.getProperty("./utils/datasheet.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(sheetLoc);

		XSSFSheet sheet = book.getSheetAt(0);

		int total_active_rows = sheet.getPhysicalNumberOfRows();
		int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
		// System.out.println("physical number of rows :"+total_active_rows);

		String userdata[][] = new String[total_active_rows-1][physicalNumberOfCells];

		for (int i = 1; i < total_active_rows; i++) {

			XSSFRow active_row = sheet.getRow(i);

			int total_active_cell_datas = active_row.getPhysicalNumberOfCells();

			for (int j = 0; j < total_active_cell_datas; j++) {

				XSSFCell current_cell = active_row.getCell(j);
				DataFormatter dataformat = new DataFormatter();
				String formatted_cell_value = dataformat.formatCellValue(current_cell);

				

				// System.out.print(formatted_cell_value+" ");
				userdata[i-1][j] = formatted_cell_value;

				

			}
			

		}

		book.close();
		return userdata;

	}

}
