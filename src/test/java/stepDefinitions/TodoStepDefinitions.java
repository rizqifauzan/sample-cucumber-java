package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class TodoStepDefinitions {
    AppiumDriver driver;

    @Given("Install the todo app")
    public void installApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "RRCRB00D16V"); // Ganti dengan nama device Anda
        capabilities.setCapability("app", "/Users/user/Downloads/SampleCucumberJavaProject-main/src/test/resources/todo.apk"); // Ganti dengan path aplikasi Anda

        this.driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Given("Rate PopUp is closed")
    public void closeTheRatePopUp(){
        System.out.println(driver);
        HomePage homePage = new HomePage(driver);
        homePage.closeTheRatePopup();
    }

    @Given("The todo app is opened")
    public void i_have_two_numbers_and() throws MalformedURLException {

    }
}
