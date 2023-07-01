package com.app;

public class JpMorganMain {

	public static void main(String[] args) {
		String str = "applesforapples";
		//String str = "ap";
		

		System.out.println(getLongestUniform(str));
	}

	static int getLongestUniform(String str) {
		//String result = "";
		if(str == null || str.isEmpty())
			return 0;
		char[] ch = str.toCharArray();
		int longestSoFar = 0;
		int count = 1;
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				longestSoFar = Math.max(count, longestSoFar);
				count = 0;
			} else if (ch[i] != ch[i + 1]) {
				count++;
			}
		}
		longestSoFar = Math.max(count, longestSoFar);
		

		return longestSoFar;
	}

}
