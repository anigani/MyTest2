package am.aca.test;

public class FCMarker extends MyMarker {
	public FCMarker() {
		super();

	}

	public FCMarker(int size) {
		super();

	}

	public FCMarker(int size, String color) {
		super(color, size);

	}

	public static void main(String[] args) {
		FCMarker m3 = new FCMarker();
		System.out.println(m3.getSize());

		FCMarker m4 = new FCMarker(5, "red");
		System.out.println(m4.getSize());
		System.out.println(m4.getString());
	}

}
