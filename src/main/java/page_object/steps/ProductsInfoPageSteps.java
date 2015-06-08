package page_object.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;


public class ProductsInfoPageSteps extends AbstractSteps {

    private static final Logger LOGGER_INFO = Logger.getLogger(ProductsInfoPageSteps.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(ProductsInfoPageSteps.class);

    public ProductsInfoPageSteps(WebDriver driver) {
        super(driver);
    }
}
