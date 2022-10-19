package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testDiseaseSampleDetailProvider() {

        var diseaseSample = new Sample("soya_disease_collector", new String[] {"a", "b", "c"});

        var diseaseProcessor =
            new SampleProcessorContext(aSample -> 
                new SampleDetail(
                    String.format(
                    "Soya Disease: %s", 
                            aSample.getSomeDetails().toString())));

        var details = diseaseProcessor.getDetails(diseaseSample);        

        // Test whether we've got disease details
        assertTrue(details.getInfo().startsWith("Soya Disease"));
        assertFalse(details.getInfo().startsWith("Soya Pest"));
    }

    @Test
    public void testPestSampleDetailProvider() {

        var pestSample = new Sample("soya_pest", new String[] {"a", "b", "c"});

        var pestProcessor =
            new SampleProcessorContext(aSample -> 
                new SampleDetail(
                    String.format(
                        "Soya Pest: %s", 
                        aSample.getSomeDetails().toString()))
                );

        var details = pestProcessor.getDetails(pestSample);        

        // Test whether we've got pest details
        assertTrue(details.getInfo().startsWith("Soya Pest"));
        assertFalse(details.getInfo().startsWith("Soya Disease"));
    }

    @Test
    public void testPulverisationSampleDetailProvider() {

        var pulvSample = new Sample("soya_pulverisation", new String[] {"a", "b", "c"});

        var pulvProcessor =
            new SampleProcessorContext(aSample -> 
                new SampleDetail(
                        String.format(
                            "Soya pulv: %s", 
                            aSample.getSomeDetails().toString())
                )
            );

        var details = pulvProcessor.getDetails(pulvSample);        

        // Test whether we've got pulverisation details
        assertTrue(details.getInfo().startsWith("Soya pulv"));
        assertFalse(details.getInfo().startsWith("Soya Disease"));
    }    

}
