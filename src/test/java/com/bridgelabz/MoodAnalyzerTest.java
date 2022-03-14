package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * We have created this test method to check the sad mood.
 * If we provide the string of sad then the method should return sad.
 * We have used the assert equals to check if the method o/p is sad.
 * 3. In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException
 * @author Tom
 *
 */
public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	@Test
    public void givenMessage_IsProper_ShouldReturnSad() throws MoodAnalyzerException{
		moodAnalyzer.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
	
	@Test
    public void givenMessage_IsProper_ShouldReturnHappy() throws MoodAnalyzerException {
		moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
	
	/**
	 * This method will return Happy if we pass as in any mood.
	 */
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() throws MoodAnalyzerException{
		moodAnalyzer.setMessage("I am in any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("ANY", actualResult);
    }
	
	/**
	 * We have created this test case to check for NullException.
	 *In case of NULL Mood throw Custom Exception MoodAnalysisException
	 *In this test case as we pass the null value the exception will be triggered and the catch block will be executed.
	 * And then in test the custom exception will be thrown.
	 */
	@Test
    public void NullReturnHappy() throws MoodAnalyzerException {
		try {
        moodAnalyzer.setMessage(null);
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("Invalid Mood", actualResult);
    } catch (MoodAnalyzerException e) {
    	System.out.println("Invalid Mood");
    }
	}
}
