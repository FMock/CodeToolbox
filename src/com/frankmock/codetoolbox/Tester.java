package com.frankmock.codetoolbox;

public class Tester {

	public static void main(String[] args) {
		NumericTools nt = new NumericTools();
		
		int[] digits = nt.decomposeInteger(12345);
		
		for(int i : digits){
			System.out.print(i + " ");
		}
	}

}
