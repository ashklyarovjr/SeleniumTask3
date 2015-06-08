package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.constants_containers.XpathContainer;
import page_object.pages.MainPage;
import page_object.pages.ProductsListPage;
import page_object.utils.CustomWaits;

public class MainPageSteps extends AbstractSteps {

    private static final Logger LOGGER_INFO = Logger.getLogger(MainPageSteps.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(MainPageSteps.class);

    MainPage mainPage;

    ProductsListPage productsListPage;

    public MainPageSteps(WebDriver driver) {
        super(driver);
        mainPage = new MainPage(driver);
    }

    public MainPageSteps(WebDriver driver, MainPage mainPage) {
        super(driver);
        this.mainPage = mainPage;
    }

    public ProductsListPageSteps goToFridgesCategory() {
        mainPage.goToPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.MainPageXPATHContainer.FRIDGES_CATEGORY_XPATH);

        productsListPage = mainPage.chooseFridgesCategory();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH);

        return new  ProductsListPageSteps(driver, productsListPage);
    }

    public ProductsListPageSteps goToWashersCategory() {
        mainPage.goToPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.MainPageXPATHContainer.WASHERS_CATEGORY_XPATH);

        productsListPage = mainPage.chooseWashersCategory();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH);

        return new ProductsListPageSteps(driver, productsListPage);
    }

    public ProductsListPageSteps goToMicrowaveOwensCategory() {
        mainPage.goToPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.MainPageXPATHContainer.MICROWAVE_OWENS_CATEGORY_XPATH);

        productsListPage = mainPage.chooseMicrowaveOwensCategory();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH);

        return new ProductsListPageSteps(driver, productsListPage);
    }

    public ProductsListPageSteps goToConditionersCategory() {
        mainPage.goToPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.MainPageXPATHContainer.CONDITIONERS_CATEGORY_XPATH);

        productsListPage = mainPage.chooseFridgesCategory();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH);

        return new ProductsListPageSteps(driver, productsListPage);
    }

    public ProductsListPageSteps goToBakersCategory() {
        mainPage.goToPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.MainPageXPATHContainer.BREAD_BAKERS_CATEGORY_XPATH);

        productsListPage = mainPage.chooseFridgesCategory();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.ALL_PRODUCTS_NAMES_LIST_XPATH);

        return new ProductsListPageSteps(driver, productsListPage);
    }
}
