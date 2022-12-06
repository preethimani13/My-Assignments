package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> word = new LinkedHashSet<String>();
		
		for (String string : split) {
			word.add(string);
		}
		System.out.println(word);
	}

}
