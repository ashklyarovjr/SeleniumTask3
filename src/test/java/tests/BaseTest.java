package tests;

import factory.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver("firefox");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
