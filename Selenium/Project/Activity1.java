package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @Test
    public void homepageTest(){

        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        //Assertion for pagetitle
        Assert.assertEquals("SuiteCRM", pageTitle);

            }

    @BeforeMethod
    public void setup(){

        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");

    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
