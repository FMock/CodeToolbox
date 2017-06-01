package com.frankmock.codetoolbox;

public class Tester {

	public static void main(String[] args) {
		NumericTools nt = new NumericTools();
		
		int[] digits = nt.decomposeInteger(-111);
		
		for(int i : digits){
			System.out.print(i + " ");
		}
		
		int ei = Searching.EquilibriumIndex(digits);
		System.out.println("The equilibrium index is " + ei);
	}

}
