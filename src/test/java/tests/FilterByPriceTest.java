package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterByPriceTest extends BaseTest {

    @Test
    public void testPriceFilter() throws Exception {
       mainPageSteps.goToWashersCategory()
               .selectMinPrice()
               .selectMaxPrice()
               .verifyPriceFilterWork()
               .goToMainPage();
    }
}
