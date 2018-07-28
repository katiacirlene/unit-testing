package com.kcpbf.unittesting.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.kcpbf.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

	private SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		
		OptionalInt number = Arrays.stream(data).reduce(Integer::sum);

		return number.orElse(0);
	}

	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();

		for (int value : data) {
			sum += value;
		}

		return sum;
	}
	
}
