package test.java.com.util;

import main.java.com.util.LevenshteinDistanceUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevenshteinDistanceUtilTest {

    @Test
    public void shouldReturnLevenshteinDistance() {
        /*
            For hello to change to alo it's necessary to remove the 'h' and 'e', and replace the 'l' for an 'a'.
            With that there are 3 changes
         */

        int expectedResult = 3;
        int actualResult = LevenshteinDistanceUtil.findLevenshteinDistance("hello", "alo");

        assertEquals(expectedResult, actualResult);
    }
}
