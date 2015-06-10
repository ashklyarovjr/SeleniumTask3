package tests;

import factory.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import page_object.pages.MainPage;
import page_object.steps.MainPageSteps;

public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public MainPageSteps mainPageSteps;

    @BeforeSuite
    public void setUp() throws Exception {
        WebDriverFactory driverFactory = new WebDriverFactory();

        driver = driverFactory.getDriver("firefox");

        mainPageSteps = new MainPageSteps(driver);
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}
