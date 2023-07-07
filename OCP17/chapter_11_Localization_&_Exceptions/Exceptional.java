// Default Exception Handler
public class Exceptional {
 
	// Even if main method doesn't handle a exception, 
	// it will be handover to 'Default Exception Handler'
	public static void main(String[] args) {
	  Object x = null;
	  x.toString();
	}
 
	static void method1() {
		method2();
	}
 
	static void method2() {
		method3();
	}
 
	static void method3() {
		System.out.println(5 / 0);
	}
 
}
