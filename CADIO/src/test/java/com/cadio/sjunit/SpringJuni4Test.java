package com.cadio.sjunit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB_INF/spring/junit-context.xml"})
public class SpringJuni4Test {

	@Test
	public void test() {
		assertTrue(true);
	}
	
	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void nullPointerExceiptionTest() {
		String str = null;
		str.toString();
	}
	
}
 