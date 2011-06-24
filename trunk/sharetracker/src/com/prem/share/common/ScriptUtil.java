package com.prem.share.common;

public class ScriptUtil {

	public static double safeDoubleParser (String doubleString) {
		double value = 0.0;
		if (!doubleString.trim().equalsIgnoreCase("-")) {
			value = Double.parseDouble(doubleString);
		}
		return value;

	}
}
