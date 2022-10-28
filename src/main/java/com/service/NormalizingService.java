package main.java.com.service;

import static main.java.com.util.LevenshteinDistanceUtil.findLevenshteinDistance;

public class NormalizingService {

    // TODO: remover funções estáticas
    // TODO: editar os ifs para usar um Map e simplificar o IF
    // TODO: Criar enum para os padrões
    public static String normalizeTitle(String str1) {
        String result = str1;

        if(getNormalizedLastWord(str1, "Engineer").equals("Engineer")) {
            result = "Software Engineer";
        } else if (getNormalizedLastWord(str1, "Accountant").equals("Accountant")) {
            result = "Accountant";
        } else if (getNormalizedLastWord(str1, "Architect").equals("Architect")) {
            result = "Architect";
        } else if (getNormalizedLastWord(str1, "Quantity surveyor").equals("Quantity surveyor")) {
            result = "Quantity surveyor";
        }

        return result;
    }

    public static boolean isInsideQualityScore(String str1, String str2) {
        return findLevenshteinDistance(str1, str2) >= 0.0 && findLevenshteinDistance(str1, str2) <= 1;
    }

    public static String getNormalizedLastWord(String str1, String str2) {
        String lastWord = str1.substring(str1.lastIndexOf(" ") + 1);
        return isInsideQualityScore(lastWord, str2) ? str2 : str1;
    }

}
