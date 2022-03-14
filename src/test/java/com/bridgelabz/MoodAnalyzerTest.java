package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * We have created this test method to check the sad mood.
 * If we provide the string of sad then the method should return sad.
 * We have used the assert equals to check if the method o/p is sad.
 * @author Tom
 *
 */
public class MoodAnalyzerTest {
	@Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
        Assert.assertEquals("SAD", actualResult);
    }

}
