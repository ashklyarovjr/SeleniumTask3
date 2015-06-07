package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import page_object.base.AbstractPage;
import page_object.constants_containers.XpathContainer;

import java.util.List;

public class ProductsListPage extends AbstractPage {

    public ProductsListPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH))
    private List<WebElement> productNamesFromOnePageList;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_PRICES_LIST_XPATH))
    private List<WebElement> productPricesFromOnePageList;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH))
    private List<WebElement> firstFiveProductsPrices;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH))
    private List<WebElement> firstFiveProductsNames;

    @FindBys(@FindBy(xpath = XpathContainer.ProductsListXPATHContainer.FIRST_FIVE_PRODUCTS_DESCRIPTIONS_LIST_XPATH))
    private List<WebElement> firstFiveProductsDescriptions;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.PRODUCTS_SORT_BY_PRICE_XPATH)
    private WebElement  productSortByPriceOption;

    @FindBy(xpath = XpathContainer.ProductsListXPATHContainer.PRODUCTS_SORT_BY_NAME_XPATH)
    private WebElement  productSortByNameOption;

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

    public List<WebElement> getFirstFiveProductsDescriptions() {
        return firstFiveProductsDescriptions;
    }

    public ProductsListPage sortByName() {
        productSortByNameOption.click();
        return this;
    }

    public ProductsListPage sortByPrice() {
        productSortByPriceOption.click();
        return this;
    }

}
