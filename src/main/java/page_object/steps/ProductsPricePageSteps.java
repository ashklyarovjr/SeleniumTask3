package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.pages.ProductsPricePage;

public class ProductsPricePageSteps extends AbstractSteps {


    private ProductsPricePage productsPricePage;

    public ProductsPricePageSteps(WebDriver driver, ProductsPricePage productsPricePage) {
        super(driver);
        this.productsPricePage = productsPricePage;
    }



}
