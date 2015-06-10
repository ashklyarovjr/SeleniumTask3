package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page_object.base.AbstractPage;
import page_object.constants_containers.XpathContainer;

import java.util.List;

public class ProductsListPage extends AbstractPage {

    public ProductsListPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver,this);
    }

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH))
    private List<WebElement> productNamesFromOnePageList;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_PRICES_LIST_XPATH))
    private List<WebElement> productPricesFromOnePageList;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH))
    private List<WebElement> firstFiveProductsPrices;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH))
    private List<WebElement> firstFiveProductsNames;


    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_PRODUCT_COMPARE_OPTION_XPATH)
    private WebElement firstProductAdditionToComparisonLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.SECOND_PRODUCT_COMPARE_OPTION_XPATH)
    private WebElement secondProductAdditionToComparisonLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.PRODUCTS_SORT_BY_PRICE_XPATH)
    private WebElement productSortByPriceOption;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.PRODUCTS_SORT_BY_NAME_XPATH)
    private WebElement productSortByNameOption;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.COMPARE_PRODUCTS_LINK_XPATH)
    private WebElement compareProductsLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;


    public WebElement getProductSortByPriceOption() {
        return productSortByPriceOption;
    }

    public WebElement getProductSortByNameOption() {
        return productSortByNameOption;
    }

    public List<WebElement> getProductNamesFromOnePageList() {
        return productNamesFromOnePageList;
    }

    public List<WebElement> getProductPricesFromOnePageList() {
        return productPricesFromOnePageList;
    }

    public List<WebElement> getFirstFiveProductsPrices() {
        return firstFiveProductsPrices;
    }

    public List<WebElement> getFirstFiveProductsNames() {
        return firstFiveProductsNames;
    }

    public WebElement getCompareProductsLink() {
        return compareProductsLink;
    }

    public ProductsListPage sortByName() {
        productSortByNameOption.click();
        return this;
    }

    public ProductsListPage sortByPrice() {
        productSortByPriceOption.click();
        return this;
    }

    public MainPage goToMainPage() {
        mainPageLink.click();
        return new MainPage(driver);
    }

    public ProductsInfoPage goToProductsInfoPage(WebElement productName) {
        productName.click();
        return new ProductsInfoPage(driver);
    }

    public ProductsListPage addFirstProductToComparison() {
        firstProductAdditionToComparisonLink.click();
        return this;
    }

    public ProductsListPage addSecondProductToComparison() {
        secondProductAdditionToComparisonLink.click();
        return this;
    }

    public ProductsComparisonPage goToProductsComparison() {
        compareProductsLink.click();
        return new ProductsComparisonPage(driver);
    }




}
