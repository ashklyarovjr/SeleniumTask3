package tests;


import org.testng.annotations.Test;

public class FilterByManufacturerTest extends BaseTest {
    @Test
    public void testFilterByManufacturers() throws Exception {
        mainPageSteps.goToBakersCategory()
                .chooseManufacturers()
                .verifyManufacturerFilterWorks()
                .goToMainPage();
    }
}
