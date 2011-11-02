package com.prem.example;

public class TestCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {2,3,4,5,8,9};
		int array2[] = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array2[1] = 1;
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
