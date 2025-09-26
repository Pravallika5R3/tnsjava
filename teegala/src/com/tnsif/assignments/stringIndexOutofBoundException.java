package com.tnsif.assignments;

public class stringIndexOutofBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World!";
		try {
			char ch=str.charAt(16);
		}catch(Exception e){
			System .out.println("String Index Out of bound exception ocuured");
		}

	}

}
