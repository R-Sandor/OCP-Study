public class Enclosing {
	static class Nested {	
		private int val = 10;
		public int val2 = 15;
	}

	public static void main(String args[]){
		Nested nest = new Nested();
		System.out.println(nest.val);
	}
}

class OutOfScope {
	Enclosing.Nested nested = new Enclosing.Nested();	
	int val = nested.val2;
}
