package oops_concept;
class Animals{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animals{
	void eat() {
		System.out.println("Bird is eating");
	}
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}
public class Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1=new Bird();
		b1.eat();
		b1.sleep();
		b1.fly();
		Animals a=new Animals();
		a.sleep();
		a.eat();

	}

}
