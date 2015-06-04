package factory.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory extends AbstractDriverFactory {
    @Override
    public WebDriver getDriver(String parameter) {
        switch (parameter) {
            case "firefox":
                return new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", "..\\SeleniumTask3\\WebDrivers\\IEDriverServer32.exe");
                return new InternetExplorerDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "..\\SeleniumTask3\\WebDrivers\\chromedriver.exe");
                return new ChromeDriver();
            default:
                throw new IllegalArgumentException("This browser is undefined!");
        }
    }
}
