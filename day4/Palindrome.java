package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		String str = "MadaM";
		String revStr = "";
	int length = str.length();
		for (int i = length-1; i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		if(str.equals(revStr)) {
		System.out.println(str+" is a Palindrome");
		}else
			System.out.println(str+" is not a Palindrome");
}
	
}
