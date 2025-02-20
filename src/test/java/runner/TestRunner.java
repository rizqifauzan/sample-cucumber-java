package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:build/cucumber-report.json", // Wajib untuk integrasi dengan Allure
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Plugin Allure untuk Cucumber 7
        }
)
public class TestRunner {
    // Tes akan dijalankan oleh JUnit 4
}
