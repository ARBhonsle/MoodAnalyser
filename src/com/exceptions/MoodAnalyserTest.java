package com.exceptions;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    public String analyseMood(String mood){
        if(mood.contains("sad")){
            return "SAD";
        }
        return "HAPPY";
    }

    @Test
    public void MoodAnalyser() throws Exception{
        MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
}
