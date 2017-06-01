package com.frankmock.codetoolbox;

public class NumericTools {
	/**
	 * Extracts the digits that make up the absolute value of
	 * the integer n, and returns them in an array. The digit at
	 * the highest place value will be in the lowest position of
	 * the array. Assumes the input integer n is a base 10 number
	 * Example: The integer 4522 will yield the array
	 * int[] digits = {4,5,2,2};
	 * @param n integer
	 * @return an integer array of the digits of n otherwise
	 * returns an empty array
	 */
	public int[] decomposeInteger(int num){
		try{
			if(num == (int)num){ // make sure num is an integer
				if(num < 0)
					num = -num; // negate negative numbers
				
				// numberOfDigits = exponent + 1
				double numberOfDigits = 1 + (Math.floor(Math.log10((double)num)));
				int numDigits = (int)numberOfDigits;
				int[] digits = new int[numDigits];
				
				// Put digit in highest place value at lowest index position
				for(int i = numDigits - 1; i >= 0; i--){
					int n = num % 10;
					digits[i] = n;
					num /= 10;
				}
				
				return digits;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new int[0]; // return an empty array if there was a problem
	}
}
