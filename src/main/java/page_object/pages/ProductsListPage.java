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

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_ONPAGE_DESCRIPTIONS_XPATH))
    private List<WebElement> productDescrptnsFromOnePageList;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH))
    private List<WebElement> firstFiveProductsPrices;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH))
    private List<WebElement> firstFiveProductsNames;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_DESCRIPTIONS_XPATH))
    private List<WebElement> firstFiveProductsDescriptions;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.BAKERS_MANUFACTURERS_XPATH))
    private List<WebElement> bakersManufacturers;


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

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.NEXT_PRODUCT_LIST_PAGE_LINK_XPATH)
    private WebElement nextPageLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.MIN_PRICE_FILTER_XPATH)
    private WebElement minPriceFilterLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.MAX_PRICE_FILTER_XPATH)
    private WebElement maxPriceFilterLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.BAKERS_FIRST_MANUFACTURER_XPATH)
    private WebElement firstManufacturerLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.BAKERS_SECOND_MANUFACTURER_XPATH)
    private WebElement secondManufacturerLink;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.WEIGHT_OPTION_XPATH)
    private WebElement weightOptionLink;


    public List<WebElement> getFirstFiveProductsDescriptions() {
        return firstFiveProductsDescriptions;
    }

    public List<WebElement> getProductDescrptnsFromOnePageList() {
        return productDescrptnsFromOnePageList;
    }

    public WebElement getFirstManufacturerLink() {
        return firstManufacturerLink;
    }

    public WebElement getSecondManufacturerLink() {
        return secondManufacturerLink;
    }

    public WebElement getWeightOptionLink() {
        return weightOptionLink;
    }

    public List<WebElement> getBakersManufacturers() {
        return bakersManufacturers;
    }

    public WebElement getNextPageLink() {
        return nextPageLink;
    }

    public WebElement getMinPriceFilterLink() {
        return minPriceFilterLink;
    }

    public WebElement getMaxPriceFilterLink() {
        return maxPriceFilterLink;
    }

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

    public ProductsListPage selectMinPrice() {
        minPriceFilterLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage selectMaxPrice() {
        maxPriceFilterLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage goToNextListPage() {
        nextPageLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseFirstManufacturer() {
        firstManufacturerLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseSecondManufacturer() {
        secondManufacturerLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseWeightOption() {
        weightOptionLink.click();
        return new ProductsListPage(driver);
    }






}
