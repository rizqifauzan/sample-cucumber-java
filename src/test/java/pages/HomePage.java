package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    private AppiumDriver driver;

    public HomePage(AppiumDriver driver){
        this.driver = driver;
        System.out.println("Appium D" + this.driver);
    }

    By laterButton = By.id("android:id/button3");
    By plusButton = By.id("com.jeffprod.todo:id/fab");

    public boolean isDisplayed(){
        driver.findElement(laterButton).isDisplayed();
        return true;
    }

    public void closeTheRatePopup(){
        driver.findElement(laterButton).click();
    }

}
