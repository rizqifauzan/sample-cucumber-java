package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;

    }

    String generateLocator(String itemName){
        String locator = "//a[.='"+ itemName + "']";
        return locator;
    }

    public void clickItem(String itemName){
        driver.findElement(By.xpath(generateLocator(itemName))).click();
    }

    // 2 function
    // 1. Void
    // 2. non void => mengembalikan nilai
}
