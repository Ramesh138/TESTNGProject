package dailyExercise;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
		String[] strArray = {"abc","def","ghi","mno","def","abc"};
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : strArray) {
			if(!set.add(arrayElement)){
				System.out.println("Duplicate Element is:" +arrayElement);
			}
			
		}
		
		

	}

}
