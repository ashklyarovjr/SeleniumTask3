package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.pages.ProductsListPage;

public class ProductsListPageSteps extends AbstractSteps{

    private static final Logger LOGGER_INFO = Logger.getLogger(ProductsListPageSteps.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(ProductsListPageSteps.class);

    public ProductsListPageSteps(WebDriver driver) {
        super(driver);
    }
}
