package tests;


import org.testng.annotations.Test;

public class SortByPriceTest extends BaseTest {
    @Test
    public void testSortByPrice() throws Exception {
        mainPageSteps.goToFridgesCategory()
                     .sortProductsByPrice()
                     .checkIfSortingByPriceIsCorrect()
                     .goToMainPage();

    }
}
