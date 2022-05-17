import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://training-support.net/selenium/simple-form");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Seema");
        lastName.sendKeys("Bannegol");

        //Enter the email
        driver.findElement(By.id("email")).sendKeys("test@example.com");

        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("1234567890");

        //Click Submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Close the browser
        driver.quit();
    }
}
