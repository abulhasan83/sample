package org.bank;

public class AxisBank extends BankInfo {
@Override
public void deposit(float ir, String acN) {
	// TODO Auto-generated method stub
	int numDep = 10;
	System.out.println("interest,nos,name"+ir+acN+numDep);
}
public static void main(String[] args) {
	AxisBank ab = new AxisBank();
	ab.deposit(7.10f,"Dep");
}
}


