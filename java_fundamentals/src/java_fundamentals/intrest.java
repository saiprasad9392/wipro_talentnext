package java_fundamentals;
import java.util.*;
public class intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gender=sc.next();
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase("Female")&& age >=1 && age <=58 ) {
			System.out.println("The percentage of intrest is 8.2");
		}
		else if(gender.equalsIgnoreCase("Female") && age >=59 && age <=100) {
			System.out.println("The percentage of intrest is 9.2");
		}
		else if(gender.equalsIgnoreCase("Male") && age >=1 && age <=58) {
			System.out.println("The percentage of intrest is 8.4");
		}
		else if(gender.equalsIgnoreCase("Male") && age >=59 && age <=100) {
			System.out.println("The percentage of intrest is 10.5");
		}
		else {
			System.out.println("Please enter correct input");
		} 

	}

}
