package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;

public class ProductsPricePageSteps extends AbstractSteps {

    private static final Logger LOGGER_INFO = Logger.getLogger(ProductsPricePageSteps.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(ProductsPricePageSteps.class);

    public ProductsPricePageSteps(WebDriver driver) {
        super(driver);
    }
}
