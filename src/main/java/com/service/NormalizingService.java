package main.java.com.service;

import main.java.com.enums.JobTitleEnum;

import static main.java.com.util.LevenshteinDistanceUtil.findLevenshteinDistance;

public class NormalizingService {

    public NormalizingService() {
    }

    /**
     * Returns a normalized title doing a fuzzy match with the last word of the input string.
     * <p>
     * This method returns the normalized title if it is inside the scope of Accountant, Architect, Software Engineer
     * and Quantity surveyor. If it is outside the scope, returns the input string.
     * </p>
     *
     * @param  inputString  user job title
     * @return String - normalized job title
     */
    public String normalizeTitle(String inputString) {
        String result = inputString;

        if (isLastWordEqualsToReference(inputString, "Engineer")) {
            result = JobTitleEnum.ENGINEER.getDescription();
        } else if (isLastWordEqualsToReference(inputString, "Accountant")) {
            result = JobTitleEnum.ACCOUNTANT.getDescription();
        } else if (isLastWordEqualsToReference(inputString, "Architect")) {
            result = JobTitleEnum.ARCHITECT.getDescription();
        } else if (isLastWordEqualsToReference(inputString, "Surveyor")) {
            result = JobTitleEnum.SURVEYOR.getDescription();
        }

        return result;
    }

    private boolean isLastWordEqualsToReference(String inputString, String reference) {
        return getNormalizedLastWord(inputString, reference).equals(reference);
    }

    private String getNormalizedLastWord(String inputString, String referenceString) {
        String lastWord = inputString.substring(inputString.lastIndexOf(" ") + 1);
        return isInsideQualityScore(lastWord, referenceString) ? referenceString : inputString;
    }

    private boolean isInsideQualityScore(String inputString, String referenceString) {
        return findLevenshteinDistance(inputString, referenceString) >= 0.0 && findLevenshteinDistance(inputString, referenceString) <= 1;
    }

}
