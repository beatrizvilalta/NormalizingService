# NormalizingService
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)


This project is made to Transform Job Titles into a Normalized version of them.

For it to work it is necessary to instantiate the NormalizeService, so that we can use the `normalizeTitle()` method with the disired job title to normalize

```
NormalizingService service = new NormalizingService();

System.out.println(service.normalizeTitle("Java engineer"));
// output "Software Engineer"
System.out.println(service.normalizeTitle("Chief Accountant"));
//output "Accountant"
```

The default Normalized titles are: “Architect", "Software engineer", "Quantity surveyor", and "Accountant". Also a fuzzy match is made so that if a typo is entered the quality score to accept it is:  0.0 <= q <= 1.0.
