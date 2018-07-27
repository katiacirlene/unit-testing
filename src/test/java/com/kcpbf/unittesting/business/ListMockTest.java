package com.kcpbf.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMockTest {
	
	private List<String> mock = mock(List.class);

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
	
	@Test
	public void returnWithGenericParameters() {
		
		when(mock.get(anyInt())).thenReturn("in28Minutes");
			
		assertEquals("in28Minutes", mock.get(0));
		assertEquals("in28Minutes", mock.get(1));
	}
	
	@Test
	public void verificationBasics() {
		
		// System Under Test (SUT)
		String value1 = mock.get(0);
		String value2 = mock.get(1);
		
		// Verify
		verify(mock).get(0);
		
		verify(mock, times(2)).get(anyInt());
		
		verify(mock, atLeast(1)).get(anyInt());
		
		verify(mock, atLeastOnce()).get(anyInt());
		
		verify(mock, atMost(2)).get(anyInt());
		
		verify(mock, never()).get(2);
	}
	
}
