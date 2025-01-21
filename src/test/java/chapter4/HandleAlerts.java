package chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	public static void main(String[] args) {

		
		List<String>list=new ArrayList<>();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		//accept
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		//dismiss
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		//pass values on alert
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("akash");
		driver.switchTo().alert().accept();
		
		
		
	}
}
