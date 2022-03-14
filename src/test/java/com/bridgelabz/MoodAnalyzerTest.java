package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * We have created this test method to check the sad mood.
 * If we provide the string of sad then the method should return sad.
 * We have used the assert equals to check if the method o/p is sad.
 * 3. If null value found than the NullPointerException will be triggered & it will return HAPPY.
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
	
	@Test
    public void givenMessage_IsProper_ShouldReturnHappy() {
		moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
	
	/**
	 * This method will return Happy if we pass as in any mood.
	 */
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
		moodAnalyzer.setMessage("I am in any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("ANY", actualResult);
    }
	
	/**
	 * We have created this test case to check for NullException.
	 * Given Null Mood Should Return Happy 
	 */
	@Test
    public void NullReturnHappy() {
        moodAnalyzer.setMessage(null);
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
}
