package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_object.base.AbstractSteps;
import page_object.constants_containers.XpathContainer;
import page_object.pages.MainPage;
import page_object.pages.ProductsComparisonPage;
import page_object.pages.ProductsListPage;
import page_object.utils.CustomAsserts;
import page_object.utils.CustomWaits;
import page_object.utils.Utils;

import java.util.List;

public class ProductsListPageSteps extends AbstractSteps{

    ProductsListPage productsListPage;

    MainPage mainPage;

    ProductsComparisonPage productsComparisonPage;

    public ProductsListPageSteps(WebDriver driver, ProductsListPage productsListPage) {
        super(driver);
        this.productsListPage = productsListPage;
    }

    public ProductsListPageSteps sortProductsByName() {

        CustomAsserts.assertThatElementIsPresentOnPage(productsListPage.getProductSortByNameOption());

        productsListPage = productsListPage.sortByName();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.SELECTED_SORT_OPTION_XPATH);

        return this;
    }

    public ProductsListPageSteps sortProductsByPrice() {

        CustomAsserts.assertThatElementIsPresentOnPage(productsListPage.getProductSortByPriceOption());

        productsListPage = productsListPage.sortByPrice();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsListXPATHContainer.SELECTED_SORT_OPTION_XPATH);

        return this;
    }

    public ProductsListPageSteps checkIfSortingByNameIsCorrect() {

        List<String> checkList = Utils.parseWebElementListToStringList(productsListPage.getProductNamesFromOnePageList());

        Assert.assertTrue(Utils.checkIfStringListIsSorted(checkList));

        return this;
    }

    public ProductsListPageSteps checkIfSortingByPriceIsCorrect() {

        List<Integer> checkList = Utils.convertPriceListToIntegerList(productsListPage.getProductPricesFromOnePageList());

        Assert.assertTrue(Utils.checkIfIntegerListIsSorted(checkList));

        return this;
    }

    public MainPageSteps goToMainPage() {

        mainPage = new MainPage(driver);

        mainPage.goToPage();

        CustomAsserts.assertThatElementIsPresentOnPage(mainPage.getNewsLabel());

        return new MainPageSteps(driver, mainPage);
    }

    public ProductsListPageSteps addFirstProductToComparison() {

        productsListPage = productsListPage.addFirstProductToComparison();

        CustomAsserts.assertThatElementIsPresentOnPage(productsListPage.getCompareProductsLink());

        return this;
    }

    public ProductsListPageSteps addSecondProductToComparison() {

        productsListPage = productsListPage.addSecondProductToComparison();

        CustomAsserts.assertThatElementIsPresentOnPage(productsListPage.getCompareProductsLink());

        String linkValue = Utils.getTextValueOfWebElement(productsListPage.getCompareProductsLink());

        CustomAsserts.assertThatStringContainsSubstring(linkValue, "2");

        return this;
    }

    public ProductsComparisonPageSteps goToComparisonPage() {

        productsComparisonPage = productsListPage.goToProductsComparison();

        CustomAsserts.assertThatStringContainsSubstring(productsComparisonPage.getUrl(), "compare");

        return new ProductsComparisonPageSteps(driver, productsComparisonPage);
    }



}
