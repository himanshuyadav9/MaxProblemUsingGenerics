package com.maximum;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void givenMaxNumber_ReturnMaximumValueSame() {
		Integer first = 56;
        Integer second = 35;
        Integer third = 65;
		FindMax maxValue=new FindMax(first, second ,third);
		Integer result =maxValue.testMaximum(first, second ,third);
		Assert.assertSame(65, result);
	}
	@Test
		public void givenMaxFloatNumber_ReturnMaximumValueSame() {
			Float first = 56.56f;
	        Float second = 35.567f;
	        Float third = 65.65f;
			FindMax maxValue=new FindMax(first, second ,third);
			Float result =maxValue.testMaximum(first, second ,third);
			Assert.assertEquals(65.65f, result, 0.0f);		
	}
	@Test
	public void givenMaxString_ReturnMaximumValueSame() {
		String first = "apple";
		String second = "peach";
		String third = "banana";
		FindMax maxValue=new FindMax(first, second ,third);
		String result =maxValue.testMaximum(first, second ,third);
		Assert.assertSame("peach", result);		
}
}
