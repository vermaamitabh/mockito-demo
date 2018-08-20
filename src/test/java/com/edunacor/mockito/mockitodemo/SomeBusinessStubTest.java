package com.edunacor.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testfindGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServicestub());
		int result=businessImpl.findGreatestFromAllData();
		
		assertEquals(24, result);
	}
}

//dataservice interface impl
class DataServicestub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}
	
}