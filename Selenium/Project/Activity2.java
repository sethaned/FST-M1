package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @Test
    public void headerurl() {
        WebElement element = driver.findElement(By.cssSelector("img[src='themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g']"));

        //WebElement element= driver.findElement(By.xpath(//div[contains(@class, 'companylogo'])));
       // WebElement element = driver.findElement(By.xpath("//img[scr='themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g']"));
        String url = element.getAttribute("src");
        System.out.println("headerurl is: " + url);

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
