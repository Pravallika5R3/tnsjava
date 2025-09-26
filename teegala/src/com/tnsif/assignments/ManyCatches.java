package com.tnsif.assignments;

public class ManyCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pravallika";
		try {
			char ch =str.charAt(22);
			System.out.println(ch);
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");

		}

	}

}
