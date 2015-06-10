package page_object.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page_object.base.AbstractSteps;
import page_object.constants_containers.XpathContainer;
import page_object.pages.MainPage;
import page_object.pages.ProductsComparisonPage;
import page_object.pages.ProductsInfoPage;
import page_object.utils.CustomAsserts;
import page_object.utils.CustomWaits;
import page_object.utils.Utils;

import java.util.List;

public class ProductsComparisonPageSteps extends AbstractSteps{

    private ProductsComparisonPage productsComparisonPage;

    private ProductsInfoPage productsInfoPage;

    private List<String> oneProductInfo;

    private List<String> bothProductsInfo;

    public ProductsComparisonPageSteps(WebDriver driver, ProductsComparisonPage productsComparisonPage) {
        super(driver);
        this.productsComparisonPage = productsComparisonPage;
        this.bothProductsInfo = bothProductsInfoInit();
    }

    public ProductsComparisonPageSteps(WebDriver driver, ProductsComparisonPage productsComparisonPage, List<String> oneProductInfo) {
        super(driver);
        this.productsComparisonPage = productsComparisonPage;
        this.bothProductsInfo = bothProductsInfoInit();
        this.oneProductInfo = oneProductInfo;
    }

    public List<String> bothProductsInfoInit() {
        try {
            bothProductsInfo = Utils.parseWebElementListToStringList(productsComparisonPage.getProductsInfoToCompare());
        } catch (NullPointerException e) {
            driver.navigate().refresh();
            bothProductsInfo = Utils.parseWebElementListToStringList(productsComparisonPage.getProductsInfoToCompare());
        }
        return bothProductsInfo;
    }

    public ProductsInfoPageSteps goToFirstProductInfo() {

        productsInfoPage = productsComparisonPage.goToFirstProductInfo();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductInfoXPATHContainer.PRODUCT_DESCRIPTION_XPATH);

        return new ProductsInfoPageSteps(driver, productsInfoPage);
    }

    public ProductsInfoPageSteps goToSecondProductInfo() {

        productsInfoPage = productsComparisonPage.goToSecondProductInfo();

        CustomWaits.waitForElementPresent(driver, XpathContainer.ProductInfoXPATHContainer.PRODUCT_DESCRIPTION_XPATH);

        return new ProductsInfoPageSteps(driver, productsInfoPage);
    }

    public ProductsComparisonPageSteps verifyThatOneProductInfoIsCorrect() {

        Assert.assertTrue(Utils.checkThatListContainsAnotherList(bothProductsInfo, oneProductInfo));

        return this;
    }


    public ProductsComparisonPageSteps verifyThatDifferentProductOptionsMarked() {

        List<WebElement> infoList = productsComparisonPage.getProductsInfoToCompare();

        for (int i = 0; i < infoList.size(); i+=3) {

            if (!Utils.compareWebElementsStringValues(infoList.get(i+1), infoList.get(i+2)))

                CustomAsserts.assertElementsAttributeValue(infoList.get(i), "class", "different");

        }
        return this;
    }

    public MainPageSteps goToMainPage() {

        MainPage mainPage = new MainPage(driver);

        mainPage.goToPage();

        CustomAsserts.assertThatElementIsPresentOnPage(mainPage.getNewsLabel());

        return new MainPageSteps(driver, mainPage);
    }
}
