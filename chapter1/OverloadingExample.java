public class OverloadingExample {

	public static void main(String args[]){
		OverloadingExample ol = new OverloadingExample();
		// .. Yes we know this deprecated referr to the javadoc.
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Float.html
		// Float get autoboxed into a double since it is a larger type.
		ol.myFunc((float)5.0);
		// ol.myFunc((Byte)2); Can't cast an int to a Byte. Must use new.
		ol.myFunc(new Byte((byte)2)); // Autoboxs to a larger data type of int. 
		// from a byte.
		ol.myFunc((byte) 2);
	}

	int overloadMe(){
		return 0;

	}
	
	// This doesn't compile because one method already returns
	// double overloadMe(){ return 0.0; } A
	void myFunc(int test1, int test2){}
	//void myFunc(short test3){System.out.println("short");}
	//void myFunc(float test3){ System.out.println("float");}
	void myFunc(int test4){ System.out.println("int"); }
	void myFunc(double test4){ System.out.println("double"); }
	void myFunc(Double test4){ System.out.println("Double"); }
	void myFunc(Long test4){ System.out.println("Long"); }
}
