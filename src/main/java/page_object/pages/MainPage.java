package page_object.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page_object.base.AbstractPage;
import page_object.constants_containers.SiteInfoContainer;
import page_object.constants_containers.XpathContainer;

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver, SiteInfoContainer.PN_URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = XpathContainer.MainPageXPATHContainer.FRIDGES_CATEGORY_XPATH)
    private WebElement fridgeCategoryLink;

    @FindBy(xpath = XpathContainer.MainPageXPATHContainer.CONDITIONERS_CATEGORY_XPATH)
    private WebElement conditionersCategoryLink;

    @FindBy(xpath = XpathContainer.MainPageXPATHContainer.WASHERS_CATEGORY_XPATH)
    private WebElement washersCategoryLink;

    @FindBy(xpath = XpathContainer.MainPageXPATHContainer.BREAD_BAKERS_CATEGORY_XPATH)
    private WebElement breadBakersCategoryLink;

    @FindBy(xpath = XpathContainer.MainPageXPATHContainer.MICROWAVE_OWENS_CATEGORY_XPATH)
    private WebElement microwavesCategoryLink;

    public ProductsListPage chooseFridgesCategory() {
        fridgeCategoryLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseConditionersCategory() {
        conditionersCategoryLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseWashersCategory() {
        washersCategoryLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseBakersCategory() {
        breadBakersCategoryLink.click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage chooseMicrowaveOwensCategory() {
        microwavesCategoryLink.click();
        return new ProductsListPage(driver);
    }
}
