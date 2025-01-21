package chapter4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buttons {

	@Test
	public  void Buttons() {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		
		
		
		//to get the x and y co oridinates of the element
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		
		// to get the element color code
		String csscolor = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(csscolor);
		
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		int height = rect.getHeight();
		int width=rect.getWidth();
		System.out.println(height + " "+width);
		
		boolean isenabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isenabled);
		
	}
}
