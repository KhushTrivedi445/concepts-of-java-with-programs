package javaprograms;

public class MethodOverloading {
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static double add(double a,double b) {
		return a+b;
	}
	public static void main(String args[]) {
		System.out.println("The addition is: "+add(5,3));
		System.out.println("The addition is: "+add(5,3,2));
		System.out.println("The addition is: "+add(5,3));
	}

}
