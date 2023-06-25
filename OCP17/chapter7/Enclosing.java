public class Enclosing {
	static class Nested {	
		private int val = 10;
		public int val2 = 15;
	}

	public static void main(String args[]){
		Nested nest = new Nested();
		System.out.println(nest.val);
    var os = new OutOfScope();
    System.out.println(os.nested.val);
	}
}

class OutOfScope {
	Enclosing.Nested nested = new Enclosing.Nested();	
	int val = nested.val2;
  public void val() {
   // System.out.println(nested.val);
  }
}
