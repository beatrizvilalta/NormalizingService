package main.java.com;

import main.java.com.service.NormalizingService;
import main.java.com.util.LevenshteinDistanceUtil;

public class Main {

    public static void main(String[] args) {

        NormalizingService service = new NormalizingService();

        System.out.println(service.normalizeTitle("Java engineer"));
        System.out.println(service.normalizeTitle("Java enginer"));
        System.out.println(service.normalizeTitle("Teacher"));
        System.out.println(service.normalizeTitle("Chief Accountant"));
        System.out.println(service.normalizeTitle("Cloud Architect"));
        System.out.println(service.normalizeTitle("Junior Quantity Surveyor"));

    }
}
