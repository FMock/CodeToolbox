package com.frankmock.codetoolbox;

public class Searching {
	
	/**
	 * Finds the first equilibrium index (EI) of an array of integers.
	 * The EI is the array index where the sum of the values to it's
	 * right is equal to the sum of the values to it's left.
	 * @param array - an array of integers
	 * @return the EI integer otherwise -1 if no EI exists
	 */
	public static int EquilibriumIndex(int[] array){
		if(array.length == 0) // empty array
			return -1;
		
		if(array.length == 1)
			return 0;
		
		int ei, sum = 0, leftSum = 0, rightSum = 0;
		
		// Get the sum of all values
		for(int i : array)
			sum += i;
		
		rightSum = sum;
		for(int i = 0; i < array.length; i++){
			rightSum -= array[i];
			if(rightSum == leftSum){
				ei = i;
				return ei;
			}
			leftSum += array[i];
		}
		
		return -1;
	}
}
