import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

          public static void main(String[] args) {

              //Create a new instance of the Firefox driver
              System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
              WebDriver driver = new FirefoxDriver();

            //Open the browser
            driver.get("https://www.training-support.net/selenium/dynamic-controls");

            //Find the checkbox
            WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
            System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

            //driver.findElement(By.xpath("//[input type='checkbox'")).click();
              driver.findElement(By.id("dynamicCheckbox")).click();

            System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());

            //Close the browser
            driver.close();

        }

    }

