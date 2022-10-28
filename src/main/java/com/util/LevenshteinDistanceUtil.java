package main.java.com.util;

import java.util.Arrays;

public class LevenshteinDistanceUtil {

    public static int findLevenshteinDistance(String inputString, String referenceString) {
        String str1LowerCase = inputString.toLowerCase();
        String str2LowerCase = referenceString.toLowerCase();
        int[][] matrix = new int[inputString.length() + 1][referenceString.length() + 1];

        for (int i = 0; i <= inputString.length(); i++)
        {
            for (int j = 0; j <= referenceString.length(); j++) {
                if (i == 0) {
                    matrix[i][j] = j;
                }
                else if (j == 0) {
                    matrix[i][j] = i;
                }

                else {
                    int[] numbersArray = {
                            matrix[i - 1][j - 1] + numberOfReplacements(str1LowerCase.charAt(i - 1), str2LowerCase.charAt(j - 1)), // replace
                            matrix[i - 1][j] + 1, // delete
                            matrix[i][j - 1] + 1};// insert

                    matrix[i][j] = minimumEdits(numbersArray);
                }
            }
        }

        return matrix[inputString.length()][referenceString.length()];
        }

        private static int numberOfReplacements(char c1, char c2) {
            return c1 == c2 ? 0 : 1;
        }

        private static int minimumEdits(int[] numbers) {
            return Arrays.stream(numbers).min().orElse(
                    Integer.MAX_VALUE);
        }
    }

