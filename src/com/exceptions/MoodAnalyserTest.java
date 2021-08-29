package com.exceptions;

import com.exceptions.MoodAnalysisException;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {
    static String mood;
    private Object MoodAnalysisException;

    public MoodAnalyserTest() {
    }

    public String analyseMood(String mood) throws Exception, MoodAnalysisException {

        if(mood.length()==0){
            throw new MoodAnalysisException("HAPPY");
        }else if (mood.contains("sad")) {
            return "SAD";
        } else if (mood.contains("Sad")) {
            return "SAD";
        } else if (mood.contains("Happy")) {
            return "SAD";
        }
        return "HAPPY";
    }

    @Test
    public void MoodAnalyser() throws Exception {
        try {
            MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
            String mood = moodAnalyser.analyseMood("This is a sad message");
            Assert.assertThat(mood, CoreMatchers.is("SAD"));

            mood = moodAnalyser.analyseMood("I am in Sad Mood");
            Assert.assertThat(mood, CoreMatchers.is("SAD"));

            mood = moodAnalyser.analyseMood("I am in Any Mood");
            Assert.assertThat(mood, CoreMatchers.is("HAPPY"));

            mood = moodAnalyser.analyseMood("I am in Happy Mood");
            Assert.assertThat(mood, CoreMatchers.is("SAD"));

            this.mood = moodAnalyser.analyseMood("");

        } catch (Exception | com.exceptions.MoodAnalysisException e){
            this.mood = "HAPPY";
            if(e.equals(MoodAnalysisException)){
                Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
            }
        }
    }
}
