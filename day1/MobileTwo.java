package week1.day1;

public class MobileTwo {
	char mobileLogo = 'G';
	short noOfMobilePiece =2;
	int modelNumber = 4;
	float mobilePrice = 30000.5f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		MobileTwo obj = new MobileTwo();
		System.out.println("Mobile Logo:"+obj.mobileLogo);
		System.out.println("Number of Pieces: "+obj.noOfMobilePiece);
		System.out.println("Model Number: "+obj.modelNumber);
		System.out.println("Mobile Price: "+obj.mobilePrice);
		System.out.println("Damage in Device: "+obj.isDamaged);
	}

}
