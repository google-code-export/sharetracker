package com.prem.example;

public class HashCodeExample {

	private void stringHashCode() {
		String str1 = new String("");
		String str2 = new String("0");
		String str3 = new String("1");
		String str4 = new String("2");
		String str5 = new String("a");
		String str6 = new String("b");
		String str7 = new String("c");
		String str8 = new String("01");

		System.out.println("-----------String Hash Code------------");
		System.out.println("HashCode str1:" + str1.hashCode());
		System.out.println("HashCode str2:" + str2.hashCode());
		System.out.println("HashCode str3:" + str3.hashCode());
		System.out.println("HashCode str4:" + str4.hashCode());
		System.out.println("HashCode str5:" + str5.hashCode());
		System.out.println("HashCode str6:" + str6.hashCode());
		System.out.println("HashCode str7:" + str7.hashCode());
		System.out.println("HashCode str8:" + str8.hashCode());
		System.out.println("-----------End of String Hash Code------------");
	}

	public static void main(String argv[]) {
		HashCodeExample example = new HashCodeExample();
		example.stringHashCode();
	}
}
