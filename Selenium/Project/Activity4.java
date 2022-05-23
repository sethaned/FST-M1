package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @Test

    public void Login(){

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String homepageurl = driver.getCurrentUrl();
        System.out.println("Title is: " + homepageurl);
        Assert.assertEquals(homepageurl, "https://alchemy.hguy.co/crm/index.php?module=Home&action=index");
        System.out.println("homepage is displayed");

    }

    @BeforeMethod
    public void setup(){

        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
        //Login
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

    }


    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
