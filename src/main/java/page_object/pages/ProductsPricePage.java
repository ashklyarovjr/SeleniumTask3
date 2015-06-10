package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page_object.base.AbstractPage;
import page_object.constants_containers.XpathContainer;

import java.util.List;

public class ProductsPricePage extends AbstractPage{

    public ProductsPricePage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBys(@FindBy(xpath = XpathContainer.ProductPriceXPATHContainer.FIRST_FIVE_PRODUCTS_FROM_PRICE_XPATH))
    private List<WebElement> firstFiveProductsFromPrice;

    @FindBy(xpath = XpathContainer.ProductPriceXPATHContainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;

    public List<WebElement> getFirstFiveProductsFromPrice() {
        return firstFiveProductsFromPrice;
    }

    public WebElement getMainPageLink() {
        return mainPageLink;
    }
}
