package chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {
	
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("akash");
		driver.findElement(By.id("join")).sendKeys(" Youtuber",Keys.TAB);
		String value=driver.switchTo().activeElement().getAttribute("value");
		boolean isenable=driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isenable);
		String isRead=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isRead);
	}

}
