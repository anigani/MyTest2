package am.aca.test;

public class MyMarker {
	private String color = "red";
	private int size = 2;

	public MyMarker() {

	}

	public MyMarker(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	/*public MyMarker(String color, int size) {
		setSize(size);
		setColor(color);
	}*/

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size > 0) {
			this.size = size;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getString() {

		return color;
	}

	public static void main(String[] args) {
		MyMarker m1 = new MyMarker();
		System.out.println(m1.getSize());

		MyMarker m2 = new MyMarker();
		System.out.println(m2.getSize());
		// m1.setSize(10);
		System.out.println(m1.getSize());
	}

}
