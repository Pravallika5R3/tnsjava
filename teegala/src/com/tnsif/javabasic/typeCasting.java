package com.tnsif.javabasic;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte -> short -> char -> int -> long -> float -> double
				//Widening Casting (automatic)or implicite
				int a=10;
				double b=a;
				
				int c=(int)b;
				System.out.println(a + " type casted to " + b);
				//Narrowing Casting (manual) explicite
				System.out.println(b+" explicitly coverted to "+c );



	}

}
