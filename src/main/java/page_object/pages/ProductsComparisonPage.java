package page_object.pages;


import org.openqa.selenium.WebDriver;
import page_object.base.AbstractPage;

public class ProductsComparisonPage extends AbstractPage{
    public ProductsComparisonPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }
}
