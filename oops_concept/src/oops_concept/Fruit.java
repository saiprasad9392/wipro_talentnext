package oops_concept;
class Fruits{
	String name;
	String taste;
	String size;
	Fruits(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Fruit:"+ name+ ", Taste:"+taste);
	}
}
class Apple extends Fruits{
	Apple(String size){
		super("Apple","sweet",size);
	}
	@Override
	void eat() {
		
	System.out.println("Fruit :"+name +" Taste : "+ taste +" (Sweet and fresh)");
}
}
class Orange extends Fruits{
	Orange(String size){
		super("Orange","pulpy",size);
	}
	@Override
	void eat(){
		System.out.println("Fruit :"+ name +" Taste : "+ taste +" (pulpy and tasty)");
	}
}

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits Apples=new Apple("Small");
		Fruits Oranges=new Orange("Medium");
		Apples.eat();
		Oranges.eat();

	}

}
