package com.prem.example;

public class Numeroligy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int startRange = 8950;
		int endRange = 9999;
		String initial = "TN22CY";
		
		for (int i = startRange; i <= endRange; i++) {
//			System.out.println(i);
			String value = i + "8"; // 8 = Sum of "TN22CY"
//			System.out.println(value);
			char charArray[] = value.toCharArray();
			int numerologyCount = 0;
			numerologyCount = new Numeroligy().sum(charArray);
			if(numerologyCount == 5) {
				System.out.println("TN 22 CY " + i);
			}
		}
	}

	public int sum(char charArray[]) {
//		System.out.println("Char[] : count " + String.valueOf(charArray));
		int count = 0;
		for (int j = 0; j < charArray.length; j++) {
			char value = charArray[j];
			count=count + Integer.parseInt(String.valueOf(value));
		}
//		System.out.println(count);
		if(count>9) {
			count = sum((count+"").toCharArray());
		}
		return count;
	}
}
