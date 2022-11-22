package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int sum = obj.addition(10,25,20);
		System.out.println("Result of Addition:"+sum);
		int sub = obj.subraction(100, 30);
		System.out.println("Result of Subraction:"+sub);
		double mul=obj.multiplication(25.575, 10.55);
		System.out.println("Result of Multiplication:"+mul);
		float div=obj.division(4.5f,1.5f);
		System.out.println("Result of Division:"+div);
		
	
	}

}
