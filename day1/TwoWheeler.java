package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	float mileage=17.3f;
	boolean isPunctured=false;
	char bikeNameFristLetter='R';

	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println("No Of Wheels : "+obj.noOfWheels);
		System.out.println("Mileage Given: "+obj.mileage);
		System.out.println("Any Puncture in the Wheels: "+obj.isPunctured);
		System.out.println("Bike First Letter: "+obj.bikeNameFristLetter);
	}

}
