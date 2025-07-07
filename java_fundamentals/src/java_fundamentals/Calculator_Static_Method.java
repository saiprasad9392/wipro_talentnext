package java_fundamentals;

public class Calculator_Static_Method {
	public static int powerInt(int a,int b) {
		return (int)Math.pow(a, b);
	}
	public static double powerDouble(double a,double b) {
		return Math.pow(a, b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=powerInt(2,3);
		System.out.println(result);
		double results=powerDouble(1.5,4);
		System.out.println(results);
		
		

	}

}
