package com.code4you.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.code4you.junit4.stringhelper.StringHelper;

@RunWith(Parameterized.class)
public class ParameterisedTestDemo {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	
	public ParameterisedTestDemo(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String[][] expectedInputOutput = {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedInputOutput);
	}

	@Test
	public void testTruncateAInFirst2Positions_NoA() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
