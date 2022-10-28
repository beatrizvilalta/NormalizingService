package test.java.com;

import main.java.com.service.NormalizingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NormalizingServiceTest {

    @Test
    void shouldNormalizeTitleWhenReceivingEngineer() {
        String expectedResult = "Software Engineer";
        String actualResult = NormalizingService.normalizeTitle("Java Engineer");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingArchitect() {
        String expectedResult = "Architect";
        String actualResult = NormalizingService.normalizeTitle("Mobile Architect");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingAccountant() {
        String expectedResult = "Accountant";
        String actualResult = NormalizingService.normalizeTitle("Chief Accountant");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldNormalizeTitleWhenReceivingTitleWithMinorTypo() {
        String expectedResult = "Accountant";
        String actualResult = NormalizingService.normalizeTitle("Chief Acccountant");

        assertEquals(expectedResult, actualResult);
    }

    //Given the job title isn't inside the scope of Accountant, Architect, Software Engineer and Quantity surveyor,
    //When the User enters its job title that is not inside the scope
    //Then return the original string inserted byt the user
    @Test
    void shouldNotNormalizeTitleWhenReceivingOtherJobTitle() {
        String expectedResult = "Teacher";
        String actualResult = NormalizingService.normalizeTitle("Teacher");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnTrueWhenIsInsideQualityScore() {
        boolean actualResult = NormalizingService.isInsideQualityScore("Engeneer", "Engineer");

        assertTrue(actualResult);
    }

    @Test
    void shouldReturnFalseWhenIsNotInsideQualityScore() {
        boolean actualResult = NormalizingService.isInsideQualityScore("Ingenier", "Engineer");

        assertFalse(actualResult);
    }

    @Test
    void shouldGetNormalizedLastWordWhenItsInsideQualityScore() {
        String expectResult = "Engineer";

    }
}
