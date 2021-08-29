package com.exceptions;

public class MoodAnalysisException extends Throwable {
    public MoodAnalysisException(String mood) throws Exception {
       throw new Exception(mood);
    }

}
