package main.java.com.enums;

public enum JobTitleEnum {

    ACCOUNTANT("Accountant"),
    ARCHITECT("Architect"),
    ENGINEER("Software Engineer"),
    SURVEYOR("Quantity Surveyor");

    private final String description;

    JobTitleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
