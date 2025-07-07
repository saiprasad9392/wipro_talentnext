package oops_concept;

public class Volume {
	int length;
	int width;
	int height;
	void getLength(int l) {
		length=l;
	}
	void getWidth(int w) {
		width=w;
	}
	void getHeight(int h) {
		height=h;
	}
	void getVolume() {
		System.out.println("The volume of the box is : " + length*width*height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v=new Volume();
		v.getLength(5);
		v.getWidth(10);
		v.getHeight(12);
		v.getVolume();
		

	}

}
