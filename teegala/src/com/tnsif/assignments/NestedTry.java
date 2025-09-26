package com.tnsif.assignments;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pravallika";
		try {
			try {
				char ch=str.charAt(10);
			}catch(StringIndexOutOfBoundsException e){
				System.out.println(e);
			}
			String str2=null;
			System.out.println(str2.length());
		}catch(NullPointerException e) {
			System.out.println(e);

		}

	}

}
/*public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int a = 10 / 0; // This causes ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            String str = null;
            System.out.println(str.length()); // This causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}*/
