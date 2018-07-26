package com.kcpbf.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMockTest {
	
	private List mock = mock(List.class);

	@Test
	public void size_basic() {
		
		when(mock.size()).thenReturn(5);
		
		assertEquals(5, mock.size());
	}
	
	@Test
	public void returnDifferentValues() {
		
		when(mock.size()).thenReturn(5).thenReturn(10);
		
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
	
	@Test
	public void returnWithParameters() {
		
		when(mock.get(0)).thenReturn("in28Minutes");
		
		assertEquals("in28Minutes", mock.get(0));
		
		// return the default value as we didn't specify the value for "mock.get(1)"
		assertEquals(null, mock.get(1));
	}
	
}
