// Default Exception Handler
public class Exceptional {
 
	// If even main method don't handled exception, It will be handover to 'Default
	// Exception Handler'
	public static void main(String[] args) {
		method1();
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
