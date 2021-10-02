package com.example;

import com.example.detail.SampleDetailProviderStrategy;

public class SampleProcessorContext {

    private SampleDetailProviderStrategy detailStrategy;

    public SampleProcessorContext(
        final SampleDetailProviderStrategy detailStrategy) {
        
            this.detailStrategy = detailStrategy;
    }

    public SampleDetail getDetails(final Sample aSample) {
        return detailStrategy.getDetails(aSample);
    } 

}
