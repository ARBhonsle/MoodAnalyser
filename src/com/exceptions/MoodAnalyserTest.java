package com.exceptions;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    static String mood;

    public MoodAnalyserTest() {
    }

    public String analyseMood(String mood) {
        if (mood.contains("sad")) {
            return "SAD";
        } else if (mood.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }

    @Test
    public void MoodAnalyser() throws Exception {
        MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));

        mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));

        mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
