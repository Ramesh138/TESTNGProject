package dailyExercise;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "MyChellam";
		//char[] chr = str.toCharArray();
		for (int i = str.length()-1; i >= 0; i--) {
			//System.out.println("The Reverse of the string:" +chr[i]);
			System.out.println(str.charAt(i));
			
		}

	}

}
