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
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnAny() throws MoodAnalyzerException{
		moodAnalyzer.setMessage("I am in any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assert.assertEquals("ANY", actualResult);
    }
	
	/**
	* We have created this method to check if there is null string is passed.
	 * If null string is passed then the exception will be occurred and the catch block will execute.
	 * In the catch block we check if the enum NULL is equal to the exception object type.
	 * If true then the test will pass and print as null
	 */
	@Test
    public void Null_MoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.exceptionType);
        System.out.println("Entered null");
        }
    }

	/**
	 * We have created this method to check if there is empty string passed.
	 * If empty string is passed then the exception will be occurred and the catch block will execute.
	 * In the catch block we check if the enum Empty is equal to the exception object type.
	 * If true then the test will pass and print as empty
	 */
    @Test
    public void Empty_MoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
            System.out.println("The string is empty");
        }
    }
}
