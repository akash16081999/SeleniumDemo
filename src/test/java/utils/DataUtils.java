package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	//indices- used to specify which set of data need to pass into test.
		//parallel - used to run the test in parallel wth the given data.
		//name - without adding a soecific data provider name directly also we can call the method in the test.
	@DataProvider(/* indices = {0,2}, */parallel = true)
	public String[][] getData() {
		String userdata[][]= {{"akash","akash"},{"kjhkj@gmail.com","kjkjk"},{"koushik350@gmail.com","Pass123$"}};
		return userdata;
	}

	
	
	@DataProvider(parallel = true)
	public String[][] getExcelSheetData() throws IOException {
		
		String[][] excelData = ReadExcel.getExcelData();
		return excelData;

	}
	
	
	
	
}
