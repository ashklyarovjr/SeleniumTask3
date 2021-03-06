package tests;


import org.testng.annotations.Test;

public class TwoItemsCompareTest extends BaseTest{
    @Test
    public void testComparisonOfTwoProducts() throws Exception {
        mainPageSteps.goToMicrowaveOwensCategory()
                .addFirstProductToComparison()
                .addSecondProductToComparison()
                .goToComparisonPage()
                .goToFirstProductInfo()
                .goToComparisonPage()
                .verifyThatOneProductInfoIsCorrect()
                .goToSecondProductInfo()
                .goToComparisonPage()
                .verifyThatOneProductInfoIsCorrect()
                .verifyThatDifferentProductOptionsMarked()
                .goToMainPage();
    }
}
