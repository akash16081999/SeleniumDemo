package chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class AUI {

    static WebDriver driver;


    @Test
    public static void draggable(){

        driver.get("https://jqueryui.com/draggable");
        driver.switchTo().frame(0);
        WebElement sourceelement=driver.findElement(By.id("draggable"));
        Actions builder=new Actions(driver);
        Point location= sourceelement.getLocation();
        builder.dragAndDropBy(sourceelement,location.getX()+80,location.getY()+40).perform();

    }

    public static void droppable(){
        driver.get("https://jqueryui.com/droppable");
        driver.switchTo().frame(0);
        WebElement sourceelement=driver.findElement(By.id("draggable"));
         WebElement target=driver.findElement(By.id("droppable"));
        Actions builder=new Actions(driver);
        Point location= sourceelement.getLocation();
        builder.dragAndDrop(sourceelement,target).perform();

    }

    public static void main(String[] args) {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //draggable();
        droppable();
    }
}
