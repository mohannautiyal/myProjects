package com.home;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StringHelperTest {
	
	
	@Autowired
	StringHelper StringHelper;

	@Test
	public void testTruncateAInFirst2Positions() {
		String stringActVal =StringHelper.truncateAInFirst2Positions("AABCD");		
       assertEquals("AABCD not truncated correctly","BCD", stringActVal);		
		
	}
	
	
	@Test
	public void testTruncateAInFirstPositions() {
		String stringActVal =StringHelper.truncateAInFirst2Positions("ABCD");		
       assertEquals("BCD", stringActVal);		
		
	}

}
