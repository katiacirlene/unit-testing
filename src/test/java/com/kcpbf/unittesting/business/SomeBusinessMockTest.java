package com.kcpbf.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.kcpbf.unittesting.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

	@InjectMocks
	private SomeBusinessImpl business;
	
	@Mock
	private SomeDataService dataServiceMock;
	
	@Test
	public void calculateSumUsingDataService_basic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		
		assertEquals(6, business.calculateSumUsingDataService());		
	}
		
	@Test
	public void calculateSumUsingDataService_empty() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });
		
		assertEquals(0, business.calculateSumUsingDataService());		
	}	

	@Test
	public void calculateSumUsingDataService_oneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5 });
		
		assertEquals(5, business.calculateSumUsingDataService());		
	}
	
}
