package chapter4;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class OK {

	public static void main(String[] args) throws IOException {

		String sheetLoc = "E:\\demo\\src\\test\\java\\utils\\datasheet.xlsx";

		// String prop = System.getProperty("./utils/datasheet.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(sheetLoc);

		XSSFSheet sheet = book.getSheetAt(0);

		int total_active_rows = sheet.getPhysicalNumberOfRows();
		System.out.println("physical number of rows :"+total_active_rows);

		for (int i = 0; i < total_active_rows; i++) {

			XSSFRow active_row = sheet.getRow(i);

			int total_active_cell_datas = active_row.getPhysicalNumberOfCells();
			// System.out.println("physical number of coloms in row :" +i+" is
			// ="+total_active_cell_datas);

			for (int j = 0; j < total_active_cell_datas; j++) {

				XSSFCell current_cell = active_row.getCell(j);
				DataFormatter dataformat=new DataFormatter();
				String formatted_cell_value = dataformat.formatCellValue(current_cell);
				
				
				if (formatted_cell_value.equals("username")| formatted_cell_value.equals("password")) {
					continue;
				} 
				System.out.print(formatted_cell_value+" ");

			}
			System.out.println();

		}
		
		book.close();

	}
}
