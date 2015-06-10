package tests;


import org.testng.annotations.Test;

public class SortByNameTest extends BaseTest {

    @Test
    public void testSortByName() throws Exception {
        mainPageSteps.goToFridgesCategory()
                     .sortProductsByName()
                     .checkIfSortingByNameIsCorrect()
                     .goToMainPage();
    }
}
