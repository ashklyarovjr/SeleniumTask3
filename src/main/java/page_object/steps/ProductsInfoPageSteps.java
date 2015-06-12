package page_object.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.constants_containers.XpathContainer;
import page_object.pages.MainPage;
import page_object.pages.ProductsComparisonPage;
import page_object.pages.ProductsInfoPage;
import page_object.pages.ProductsListPage;
import page_object.utils.CustomAsserts;
import page_object.utils.CustomWaits;
import page_object.utils.Utils;

import java.util.List;


public class ProductsInfoPageSteps extends AbstractSteps {

    private ProductsInfoPage productsInfoPage;

    public ProductsInfoPageSteps(WebDriver driver, ProductsInfoPage productsInfoPage) {
        super(driver);
        this.productsInfoPage = productsInfoPage;
    }

    public MainPageSteps goToMainPage() {

        MainPage mainPage = new MainPage(driver);

        mainPage.goToPage();

        CustomAsserts.assertThatElementIsPresentOnPage(mainPage.getNewsLabel());

        return new MainPageSteps(driver, mainPage);
    }

    public ProductsComparisonPageSteps goToComparisonPage() {

        List<String> productDescription = Utils.parseWebElementListToStringList(productsInfoPage.getProductsBaseInfoList());

        ProductsComparisonPage productsComparisonPage = productsInfoPage.goToComparisonPage();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductsComparisonXPATHContainer.BOTH_PRODUCTS_INFO_XPATH);

        return new ProductsComparisonPageSteps(driver, productsComparisonPage, productDescription);
    }

    public ProductsListPageSteps goBackToProdList() {

        ProductsListPage productsListPage = productsInfoPage.goBackToCategory();

        return new ProductsListPageSteps(driver, productsListPage);
    }





}
