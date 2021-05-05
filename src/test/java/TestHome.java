import base.BasePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestHome {
    public WebDriver driver;
    private String url;
    public static BasePage basePage;



    @Before
    public void firstly(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Sevgi Güçlü/selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://www.gittigidiyor.com/";
        basePage = new BasePage(driver);

    }


    @Test
    public void test() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();



        Actions action = new Actions(driver);
        WebElement myElement = basePage.element(By.cssSelector("div[data-cy='header-user-menu']"));
        action.moveToElement(myElement).perform();
        Thread.sleep(2000);
        /*
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("document.querySelectorAll('.qjixn8-0,.psc-1bydi5r-0,.kNKwwK').click();");

        */


        WebElement search = basePage.element(By.cssSelector("input[name='k']"));
        search.sendKeys("bilgisayar");



        WebElement searchButton = basePage.element(By.cssSelector("button[data-cy='search-find-button']"));
        searchButton.click();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");

        WebElement pageTwo = basePage.element(By.cssSelector(".pager ul.clearfix>li:nth-child(2)>a"));
        pageTwo.click();






    }
}
