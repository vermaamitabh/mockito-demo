package com.edunacor.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	@Test
	public void testfindGreatestFromAllData() {
		
		//use mock to create a dataservice mock class
		DataService dataServiceMock= mock(DataService.class);
		
		//when retrieveAllData method is called on it, we will return following
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result=businessImpl.findGreatestFromAllData();
		
		assertEquals(24, result);
	}
	
public void testfindGreatestFromAllData_ForOneValue() {
		
		//use mock to create a dataservice mock class
		DataService dataServiceMock= mock(DataService.class);
		
		//when retrieveAllData method is called on it, we will return following
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result=businessImpl.findGreatestFromAllData();
		
		assertEquals(24, result);
	}
}

