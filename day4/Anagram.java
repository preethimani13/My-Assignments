package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		if(text1.length()==text2.length()) {
			System.out.println("2 Texts Length are Equal");
			
		}
		
		char char1[]=text1.toCharArray();
		char char2[]=text2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		int count=0;
		for (int i = 0; i < char1.length; i++) {
			for (int j = 0; j < char2.length; j++) {
				if(char1[i]==char2[j]) {
					count++;
					break;
				}
					
			}
			
		}
		if(count==5) {
			System.out.println("Both arrays are Same");
		}
		else
			System.out.println("Both arrays are not Same");
	}

}
