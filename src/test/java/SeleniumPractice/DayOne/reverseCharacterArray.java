package SeleniumPractice.DayOne;

import java.util.Arrays;

public class reverseCharacterArray {

		char[] A = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String rev = "";
  		String str=String.valueOf(A);
		public String reverseString(String str){
			for (int i = A.length; i > 0; i--) {
			//	System.out.println(Arrays.toString(A));
				rev+=A[i];
			} return rev;
		}

		public void loginSet(){
			System.out.println("new Added file exisitng java file");
		}
		
		public static void main(String[] args) {
	
			reverseCharacterArray st = new reverseCharacterArray();
			char[] B=st.reverseString(st.str).toCharArray();
			System.out.println(Arrays.toString(B));
			
			//System.out.println(Arrays.toString(reverseString(str).toCharArray());

			
		}
		
}
