package oops_concept;
class shape{
	void draw() {
		System.out.println("Drawing the shape");
	}
	void erase() {
		System.out.println("Erase the diagram");
	}
}
class circle extends shape{
	@Override
	void draw() {
		System.out.println("drawing circle");
		
	}
	@Override
	void erase() {
		System.out.println("erasing circle");
	}
}
class triangle extends shape{
	@Override
	void draw() {
		System.out.println("drawing triangle");
	}
	@Override
	void erase() {
		System.out.println("erasing triangle");
	}
}
class square extends shape{
	@Override
	void draw() {
		System.out.println("drawing square");
	}
	@Override
	void erase()
	{
		System.out.println("erasing square");
	}
}
public class Polymorphism_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape c=new circle();
		shape t=new triangle();
		shape s=new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		

	}

}
