package tests;

import factory.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void setUp() throws Exception {
        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver("firefox");
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}
