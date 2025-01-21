package chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import utils.DataUtils;

public class LearnDataProvider {

	@Test(dataProvider = "getExcelSheetData", dataProviderClass = DataUtils.class)
	private void logintoLetCode(String username, String pass) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
		driver.quit();

	}
}
