package main.java.com;

import main.java.com.service.NormalizingService;

public class Main {

    public static void main(String[] args) {

        NormalizingService service = new NormalizingService();

        System.out.println(service.normalizeTitle("Java engineer"));
        System.out.println(service.normalizeTitle("Java enginer"));
        System.out.println(service.normalizeTitle("teacher"));

    }
}
