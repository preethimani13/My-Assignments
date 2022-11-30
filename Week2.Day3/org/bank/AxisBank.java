package org.bank;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit available at Axisbank");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
	}

}
