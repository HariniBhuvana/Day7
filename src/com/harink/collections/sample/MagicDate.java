package com.harink.collections.sample;

public class MagicDate {

	public static boolean isMagicDate(int month, int day, int year) {
		if (month * day == year) {
			return true;
		}
		return false;
	}
}
