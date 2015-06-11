package tests;


import org.testng.annotations.Test;

public class FilterByWeightControlOptionTest extends BaseTest {
    @Test
    public void testWeightControlOption() throws Exception {
        mainPageSteps.goToBakersCategory()
                .chooseWeightOption()
                .verifyThatFunctionFilterWorks()
                .goToMainPage();

    }
}
