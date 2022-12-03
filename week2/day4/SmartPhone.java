package week2.day4;

public class SmartPhone extends IPhone implements Mobile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj = new SmartPhone();
		obj.makeCall();
		obj.sendMessage();
		obj.saveContact();
		obj.takePhoto();
		obj.takeVideo();
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Calling...");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Message Sent successfully");
	}

	public void saveContact() {
		// TODO Auto-generated method stub
		System.out.println("Contact saved successfully");
	}

	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video taken");
	}

}
