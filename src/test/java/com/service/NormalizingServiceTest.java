package test.java.com.service;

import static org.junit.jupiter.api.Assertions.*;

import main.java.com.service.NormalizingService;
import org.junit.jupiter.api.Test;

public class NormalizingServiceTest {

    private final NormalizingService normalizingService = new NormalizingService();

    @Test
    void shouldNormalizeTitleWhenReceivingEngineer() {
        String expectedResult = "Software Engineer";
        String actualResult = normalizingService.normalizeTitle("Java Engineer");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingArchitect() {
        String expectedResult = "Architect";
        String actualResult = normalizingService.normalizeTitle("Mobile Architect");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingAccountant() {
        String expectedResult = "Accountant";
        String actualResult = normalizingService.normalizeTitle("Chief Accountant");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingQuantitySurveyor() {
        String expectedResult = "Quantity Surveyor";
        String actualResult = normalizingService.normalizeTitle("Junior Quantity Surveyor");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingTitleWithMinorTypo() {
        String expectedResult = "Accountant";
        String actualResult = normalizingService.normalizeTitle("Chief Acccountant");

        assertEquals(expectedResult, actualResult);
    }

    /**
        Given the job title isn't inside the scope of Accountant, Architect, Software Engineer and Quantity surveyor,
        When the User enters its job title that is not inside the scope
        Then return the original string inserted byt the user
    */

    @Test
    void shouldNotNormalizeTitleWhenReceivingOtherJobTitle() {
        String expectedResult = "Teacher";
        String actualResult = normalizingService.normalizeTitle("Teacher");

        assertEquals(expectedResult, actualResult);
    }
}
