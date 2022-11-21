package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call Connected to Mr.Dhilip");
	}
	
	public void sendMessage() {
		System.out.println("Message sent successfully");
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMessage();

	}

}
