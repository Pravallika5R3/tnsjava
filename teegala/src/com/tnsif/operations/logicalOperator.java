package com.tnsif.operations;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//determine the logic between variables,can also return bolean
boolean username=true;
boolean setpassword=true;
boolean enterpassword=true;
boolean otp=true;
System.out.println("registerred "+(username&&setpassword));//logical and
System.out.println("loged in "+(enterpassword||otp));//logical or
System.out.println(" invalid "+!(username&&setpassword));


	}

}
