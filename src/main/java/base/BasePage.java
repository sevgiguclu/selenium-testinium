package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {

   public static WebDriver driver;
   public BasePage(WebDriver webDriver){
       driver = webDriver;
   }

   public WebElement element(By locator){
       return driver.findElement(locator);
   }





}
