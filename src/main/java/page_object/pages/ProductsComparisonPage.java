package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page_object.base.AbstractPage;
import page_object.constants_containers.XpathContainer;

import java.util.List;

public class ProductsComparisonPage extends AbstractPage{

    public ProductsComparisonPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBys(@FindBy(xpath = XpathContainer.ProductsComparisonXPATHContainer.BOTH_PRODUCTS_INFO_XPATH))
    private List<WebElement> productsInfoToCompare;

    @FindBy(xpath = XpathContainer.ProductsComparisonXPATHContainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;

    @FindBy(xpath = XpathContainer.ProductsComparisonXPATHContainer.FIRST_PRODUCT_INFO)
    private WebElement firstProductInfoLink;

    @FindBy(xpath = XpathContainer.ProductsComparisonXPATHContainer.SECOND_PRODUCT_INFO)
    private WebElement secondProductInfoLink;

    public List<WebElement> getProductsInfoToCompare() {
        return productsInfoToCompare;
    }

    public WebElement getMainPageLink() {
        return mainPageLink;
    }

    public WebElement getFirstProductInfoLink() {
        return firstProductInfoLink;
    }

    public WebElement getSecondProductInfoLink() {
        return secondProductInfoLink;
    }

    public ProductsInfoPage goToFirstProductInfo() {
        firstProductInfoLink.click();
        return new ProductsInfoPage(driver);
    }

    public ProductsInfoPage goToSecondProductInfo() {
        secondProductInfoLink.click();
        return new ProductsInfoPage(driver);
    }

    public MainPage goToMainPage() {
        mainPageLink.click();
        return new MainPage(driver);
    }
}
