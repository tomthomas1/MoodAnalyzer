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
		moodAnalyzer.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
	
	/**
	 * This method will return Happy if we pass as in any mood.
	 */
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
		moodAnalyzer.setMessage("I am in Any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

}
