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
        Integer fourth = 72;
		FindMax maxValue=new FindMax(first, second ,third, fourth);
		Integer result =maxValue.testMaximum(first, second ,third, fourth);
		Assert.assertSame(72, result);
	}
	@Test
		public void givenMaxFloatNumber_ReturnMaximumValueSame() {
			Float first = 56.56f;
	        Float second = 35.567f;
	        Float third = 65.65f;
	        Float fourth = 72.2f;
			FindMax maxValue=new FindMax(first, second ,third, fourth);
			Float result =maxValue.testMaximum(first, second ,third, fourth);
			Assert.assertEquals(72.2f, result, 0.0f);		
	}
	@Test
	public void givenMaxString_ReturnMaximumValueSame() {
		String first = "apple";
		String second = "peach";
		String third = "banana";
		String fourth = "orange";
		FindMax maxValue=new FindMax(first, second ,third,fourth);
		String result =maxValue.testMaximum(first, second ,third,fourth);
		Assert.assertSame("peach", result);		
}
}
