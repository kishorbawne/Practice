package SeleniumPractice.DayOne;

import java.util.Arrays;

public class ReverseIteration {

	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {

		String rev2 = reverseString("Kishore");
		char[] A= rev2.toCharArray();
		System.out.println(rev2);
		System.out.println(Arrays.toString(A));
		

	}
}
