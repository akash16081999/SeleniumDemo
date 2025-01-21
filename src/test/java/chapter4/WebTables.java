package chapter4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
		
		
		
		List<WebElement> table_rows = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		System.out.println(table_rows.size());
		
		for(int i=0;i<table_rows.size();i++) {
			List<WebElement> cols = table_rows.get(i).findElements(By.tagName("td"));
			
			    System.out.println(cols.get(1).getText());
			    
			    if(cols.get(1).getText().equals("Man")) {
			    	WebElement isChecked = cols.get(3).findElement(By.tagName("input"));
			    	System.out.println(isChecked.isSelected());
			    	cols.get(3).findElement(By.tagName("input")).click();
			    	System.out.println(isChecked.isSelected());
			    	break;
			    }
			
		}
	}
}
