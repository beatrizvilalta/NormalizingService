package main.java.com.util;

import java.util.Arrays;

public class LevenshteinDistanceUtil {

    public static int findLevenshteinDistance(String str1, String str2) {
        String str1LowerCase = str1.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        int[][] matrix = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++)
        {
            for (int j = 0; j <= str2.length(); j++) {
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

        return matrix[str1.length()][str2.length()];
        }
        static int numberOfReplacements(char c1, char c2) {
            return c1 == c2 ? 0 : 1;
        }

        static int minimumEdits(int[] numbers) {
            return Arrays.stream(numbers).min().orElse(
                    Integer.MAX_VALUE);
        }
    }

