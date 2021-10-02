package com.example;

public class Sample {

    private String occurrenceType;
    private String someDetails[];

    public Sample(final String occurrenceType) {
        this.occurrenceType = occurrenceType;
    }

    public Sample(
        final String occurrenceType,
        final String someDetails[]) {

        this(occurrenceType);
        this.someDetails = someDetails;
    }

    public String getOccurrenceType() {
        return occurrenceType;
    }

    public String[] getSomeDetails() {
        return someDetails;
    }

}
