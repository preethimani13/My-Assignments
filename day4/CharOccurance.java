package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char char1[]=str.toCharArray();
	
		for (int i = 0; i < char1.length; i++) {
			if(char1[i]=='e') 
				count++;
	}
		System.out.println("Number of 'e' letter occurances are:" +count);
	}
}
