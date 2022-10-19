package com.example;

import java.util.function.Function;

public class SampleProcessorContext {

    private Function<Sample, SampleDetail> detailStrategy;

    public SampleProcessorContext(
        final Function<Sample, SampleDetail> detailStrategy) {
        
            this.detailStrategy = detailStrategy;
    }

    public SampleDetail getDetails(final Sample aSample) {
        return detailStrategy.apply(aSample);
    } 

}
