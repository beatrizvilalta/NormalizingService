package main.java.com;

import main.java.com.service.NormalizingService;

public class Main {

    public static void main(String[] args) {
        System.out.println(NormalizingService.normalizeTitle("Java engineer"));
        System.out.println(NormalizingService.normalizeTitle("Java enginer"));
        System.out.println(NormalizingService.normalizeTitle("C# engineer"));

        System.out.println(NormalizingService.normalizeTitle("Cloud Architect"));
        System.out.println(NormalizingService.normalizeTitle("Senior Architect"));
        System.out.println(NormalizingService.normalizeTitle("chief Accountan"));
    }
}
