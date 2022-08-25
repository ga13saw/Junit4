package com.code4you.junit4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.code4you.junit4.stringhelper.StringHelper;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AatFirst2Positions() {
		assertEquals("CDE", helper.truncateAInFirst2Positions("AACDE"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AatFirstPositions() {
		assertEquals("BD", helper.truncateAInFirst2Positions("ABD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoA() {
		assertEquals("BD", helper.truncateAInFirst2Positions("BD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_FalseCondition() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));;
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TrueCondition() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));;
	}

}
