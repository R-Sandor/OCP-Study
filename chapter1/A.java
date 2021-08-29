public class A {
	private int x = 10;
	
	class B {
		{
			A.this.x = 15;
		}

		public void changeX(){
			A.this.x = 15;
		}
		B(){}
		private int x = 20;
		class C {
			private int x = 30;
			public void allX(){
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
				// This doesn't work because it treats it like a static.
				// System.out.println(A.x);
				//System.out.println(super.x);
			}
		}
	}

	public static void main(String[] args){
		A a = new A();
		A.B b = a.new B();
		B b2 = a.new B();
		// Doesn't compile because the compiler 
		// requires that the outter class be instaniated.
		B b3 = new a.B(); 		
		A.B.C c = b.new C();
		c.allX();
	}
}
