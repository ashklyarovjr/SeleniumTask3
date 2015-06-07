package page_object.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaits {
    public static WebElement waitForElementPresent(WebDriver driver, String elementXpath) {
        return (new WebDriverWait(driver, 30)).until((WebDriver driver1) -> driver1.findElement(By.xpath(elementXpath)));
    }


}
