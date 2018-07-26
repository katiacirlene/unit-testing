package com.kcpbf.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.kcpbf.unittesting.data.SomeDataService;

public class SomeBusinessMockTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();		
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		business.setSomeDataService(dataServiceMock);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);		
	}
	
	/*
	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		
		int actualResult = business.calculateSumUsingDataService();  // new int[] { }
		int expectedResult = 0;
		
		assertEquals(expectedResult, actualResult);		
	}	

	@Test
	public void calculateSumUsingDataService_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceOneElementStub());
		
		int actualResult = business.calculateSumUsingDataService();   // new int[] { 5 }
		int expectedResult = 5;
		
		assertEquals(expectedResult, actualResult);		
	}
	*/
	
}
