package com.maximum;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void givenMaxStringAtThirdPosition_ReturnMaximumValueSame() {
		Integer first = 56;
        Integer second = 35;
        Integer third = 65;
		FindMax maxValue=new FindMax(first, second ,third);
		Integer result =maxValue.testMaximum(first, second ,third);
		Assert.assertSame(65, result);
	}
}
