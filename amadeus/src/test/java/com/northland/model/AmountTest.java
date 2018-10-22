package com.northland.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmountTest {

	@Test
	public void testAmountComparison() {
		final Amount amt1 = new Amount().amount("1");
		final Amount amt2 = new Amount().amount("2");
		final Amount amt3 = new Amount().amount("2");
		
		assertTrue(amt1.compareTo(amt2) < 0);
		assertFalse(amt1.compareTo(amt2) > 0);
		
		assertTrue(amt2.compareTo(amt3) == 0);
		assertTrue(amt3.compareTo(amt1) > 0);
	}
}
