package org.example;

public interface BikeParts {
    String COMPANY = "Oracle Cycles";

    default String getCompany() {
        return COMPANY;
    }
}
