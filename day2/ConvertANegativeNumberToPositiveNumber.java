package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int value = -25;
		System.out.println("Negative Number: "+value);
		if(value<0) {
			int result=value*-2;
			System.out.println("Converted Positive Number is: "+result);
		}else
			System.out.println("Value is not a Negative number");

	}

}
