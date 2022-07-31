public class Color {
	private int hue = 10;
    public class Shade {
    	public int hue = Color.this.hue;
    }
    public static void main(String[] args) {
		// Doe's not compile because shade is not static.
    	//System.out.println(new Shade().hue);

		// This compiles because we instaniated the class
		// the contains the member as a member inner class.
		System.out.println(new Color().new Shade().hue);
	}
}
