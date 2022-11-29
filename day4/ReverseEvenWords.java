package week1.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a software tester"; 
		
		String[] s1 = str.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			if(i%2!=0) {
			    char[] char1=s1[i].toCharArray();
			    
			   for(int j=char1.length-1;j>=0;j--) {
				   System.out.print(char1[j]);
			   }
			}
			else
				System.out.print(" "+s1[i]+" ");
		
		}
	}
}
