package com.edunacor.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock 
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testfindGreatestFromAllData() {
		
		//when retrieveAllData method is called on it, we will return following
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		assertEquals(24, businessImpl.findGreatestFromAllData());
	}
	
	@Test
	public void testfindGreatestFromAllData_ForOneValue() {
		
		//when retrieveAllData method is called on it, we will return following
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		assertEquals(15, businessImpl.findGreatestFromAllData());
	}
}

