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

    @FindBys(@FindBy(xpath = XpathContainer.ProductsComparisonXPATHCantainer.BOTH_PRODUCTS_INFO_XPATH))
    private List<WebElement> productsInfoToCompare;

    @FindBy(xpath = XpathContainer.ProductsComparisonXPATHCantainer.MAIN_PAGE_LINK_XPATH)
    private WebElement mainPageLink;

    public MainPage goToMainPage() {
        mainPageLink.click();
        return new MainPage(driver);
    }
}
