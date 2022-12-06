package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Preethi";
		char[] ch = name.toCharArray();
		
		Set<Character> word = new HashSet<Character>();
		
		for (Character ch1 : ch) {
			word.add(ch1);
			word.remove('e');
			
		}
		System.out.println(word);
	}

}
