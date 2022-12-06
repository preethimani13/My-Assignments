package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] split = text.split(" ");
		
		Set<String> result = new LinkedHashSet<String>();
		for (String string : split) {
			result.add(string);
		}
		
		System.out.print(result);
	}
}
