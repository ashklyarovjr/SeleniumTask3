package page_object.utils;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaits {

    public static WebElement waitForElementPresent(WebDriver driver, String elementXpath) {
        return (new WebDriverWait(driver, 10)).until((WebDriver driver1) -> driver1.findElement(By.xpath(elementXpath)));
    }

    public static WebElement waitForElementClickable(WebDriver driver, String elementXpath) {
        return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
    }




}
