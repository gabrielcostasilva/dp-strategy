package com.example.detail;

import com.example.Sample;
import com.example.SampleDetail;

public class SoyaPulverisationDetailProvider 
    implements SampleDetailProviderStrategy {

    @Override
    public SampleDetail getDetails(final Sample aSample) {

        return new SampleDetail(
            String.format(
                "Soya pulv: %s", 
                aSample.getSomeDetails().toString()));
    }
    
}
