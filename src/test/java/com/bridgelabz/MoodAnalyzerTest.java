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
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	@Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
        Assert.assertEquals("SAD", actualResult);
    }
	
	/**
	 * This method will return Happy if we pass as in any mood.
	 */
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        String actualResult = moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", actualResult);
    }

}
