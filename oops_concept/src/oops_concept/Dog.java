package oops_concept;


public class Dog {
	String name;
	String breed;
	int age;
	String color;
	public Dog(String name,String breed,int age,String color) {
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;	
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	@Override public String toString()
    {
        return "Name is: " + this.getName()
                + "\nBreed is : "+ this.getBreed()
                +"\nage is : "+ this.getAge()
             +"\ncolor is : " + this.getColor();
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog puppy=new Dog("abz","husky",10,"white");
		System.out.println(puppy.toString());
		
	}

}
