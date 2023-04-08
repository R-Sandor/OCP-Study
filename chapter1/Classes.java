class Block {
	int bno;
	static class Counter{
		int locator;
		Counter(){ locator = 2; }
	}
}

class Product {
	interface Moveable { void move();}
	Moveable mProduct = new Moveable() {
		public void move() { }

		// can not do this because it makes it
		// more restrictive than the interface
		// void move() { }
	};
}

public class Classes {}
