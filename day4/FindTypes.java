package week1.day4;

public class FindTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char char1[]=str.toCharArray();
		for (int i = 0; i <char1.length;i++) {
			if (Character.isDigit(char1[i])==true) {
				num++;
			}else if(Character.isLetter(char1[i])==true) {
				letter++;
				}else if(Character.isSpaceChar(char1[i])==true){
					space++;
				}else
					specialChar++;
		}
		      
		System.out.println("Number's count : "+num);
		System.out.println("Alphabet's count : "+letter);
		System.out.println("Space count : "+space);
		System.out.println("Special Character's count : "+specialChar);
		
	}

}
