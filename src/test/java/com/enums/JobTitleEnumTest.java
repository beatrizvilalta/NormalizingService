package test.java.com.enums;

import main.java.com.enums.JobTitleEnum;
import main.java.com.util.LevenshteinDistanceUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTitleEnumTest {

    @Test
    public void shouldReturnEnumDescription() {

        String expectedResult = "Software Engineer";
        String actualResult = JobTitleEnum.ENGINEER.getDescription();

        assertEquals(expectedResult, actualResult);
    }
}
