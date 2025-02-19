package chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.DataUtils;

public class CrossBrowser {
	
	WebDriver driver;
	
	/*
	 * @Parameters({"email","pass","browser"})
	 * 
	 * @Test() public void Buttons(String email,String pass,String Browser) throws
	 * Exception { System.out.println(email + " "+ pass+" "+Browser);
	 * 
	 * switch (Browser) { case "chrome": driver=new ChromeDriver(); break;
	 * case"firefox": driver=new FirefoxDriver(); break; default: throw new
	 * Exception("no browser found");
	 * 
	 * }
	 * 
	 * 
	 * driver.manage().window().maximize();
	 * driver.get("https://letcode.in/buttons");
	 * 
	 * //to get the x and y co oridinates of the element Point location =
	 * driver.findElement(By.id("position")).getLocation();
	 * System.out.println(location);
	 * 
	 * // to get the element color code String csscolor =
	 * driver.findElement(By.id("color")).getCssValue("background-color");
	 * System.out.println(csscolor);
	 * 
	 * Rectangle rect = driver.findElement(By.id("property")).getRect(); int height
	 * = rect.getHeight(); int width=rect.getWidth(); System.out.println(height +
	 * " "+width);
	 * 
	 * boolean isenabled = driver.findElement(By.id("isDisabled")).isEnabled();
	 * System.out.println(isenabled);
	 * 
	 * }
	 */
	

	@Parameters({"email","pass"})
	@Test()
	private void logintoLetCode(String username,String pass) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();

	}

}
