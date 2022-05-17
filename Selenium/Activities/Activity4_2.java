import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4_2 {

    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Testing");
        lastName.sendKeys("Selenium");

        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        // Alert interface and switchTo().alert() method
        Alert al = driver.switchTo().alert();
        // click on OK to accept with accept()
        al.accept();
    }
}