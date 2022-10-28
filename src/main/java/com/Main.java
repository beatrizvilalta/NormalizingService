package main.java.com;

import main.java.com.enums.JobTitleEnum;
import main.java.com.service.NormalizingService;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        NormalizingService service = new NormalizingService();

        System.out.println(service.normalizeTitle("Java engineer"));
        System.out.println(service.normalizeTitle("Java enginer"));
        System.out.println(service.normalizeTitle("teacher"
        ));

        Map<String, String> map = new HashMap<>();
        map.put("Engineer", JobTitleEnum.ENGINEER.getDescription());
        map.put("Accountant", JobTitleEnum.ACCOUNTANT.getDescription());
        System.out.println(map.get("oi"));
        System.out.println(map.get("Engineer"));

//        System.out.println(NormalizingService.normalizeTitle("C# engineer"));
//
//        System.out.println(NormalizingService.normalizeTitle("Cloud Architect"));
//        System.out.println(NormalizingService.normalizeTitle("Senior Architect"));
//        System.out.println(NormalizingService.normalizeTitle("chief Accountan"));
    }
}
