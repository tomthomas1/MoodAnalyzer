package com.bridgelabz;
/**
 * We have created this class to check the mood according to the input string.
 * We have created a method analyseMood that will take a string input and return the mood accordingly.
 * @author Tom
 *
 */
public class MoodAnalyzer {
	/**
	 * This method will compute if the mood is happy or sad.
	 * 1. We will convert the message to lower case and check it the string contains happy or sad word in it.
	 * Accordingly we will return Happy or Sad mood.
	 * @param message -  We will pass the string message from the main method.
	 * @return - We will return the mood Happy or Sad 
	 */
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}
}
