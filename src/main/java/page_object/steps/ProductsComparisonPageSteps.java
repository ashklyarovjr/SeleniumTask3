package page_object.steps;


import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.pages.ProductsComparisonPage;

public class ProductsComparisonPageSteps extends AbstractSteps{

    private ProductsComparisonPage productsComparisonPage;

    public ProductsComparisonPageSteps(WebDriver driver, ProductsComparisonPage productsComparisonPage) {
        super(driver);
        this.productsComparisonPage = productsComparisonPage;
    }
}
