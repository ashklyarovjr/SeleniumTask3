package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page_object.base.AbstractPage;
import page_object.constants_containers.XpathContainer;

import java.util.List;

public class ProductsInfoPage extends AbstractPage {

    public ProductsInfoPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }

    @FindBys(@FindBy(xpath = XpathContainer.ProductInfoXPATHContainer.PRODUCT_DESCRIPTION_XPATH))
    private List<WebElement> productsBaseInfoList;

    @FindBy(xpath = XpathContainer.ProductInfoXPATHContainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;

    @FindBy(xpath = XpathContainer.ProductInfoXPATHContainer.COMPARE_PRODUCTS_LINK_XPATH)
    private WebElement compareProductsLink;

    public List<WebElement> getProductsBaseInfoList() {
        return productsBaseInfoList;
    }

    public WebElement getMainPageLink() {
        return mainPageLink;
    }

    public WebElement getCompareProductsLink() {
        return compareProductsLink;
    }

    public ProductsComparisonPage goToComparisonPage() {
        compareProductsLink.click();
        return new ProductsComparisonPage(driver);
    }
}
