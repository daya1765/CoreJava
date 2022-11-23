package com.array.test;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.array.service.ServiceArray;


public class ServiceArrayTest {
	
	ServiceArray sa;
	@Before
	public void setUp() throws Exception {
		sa = new ServiceArray();
	}
	
	@After
	public void tearDown() throws Exception {
		sa = null;
	}

	
	@Test
	public  void arraymaxtest() {
		
	    
		assertEquals(9,sa.arraymax(new int[] {2,9}));
		
	}

}
