// All public interfaces need to be in their own
// class.
//public interface Test {
// Method that must be implemented
//	void myTest();		
//}
class Generic<T> implements Test {
    public static void main(String args[]) {
        Generic<Tester> myTester = new Generic<>();
        myTester.myTest();
        myTester.print(new Tester());
    }

    void print(T t) {
        System.out.println(t);
    }

    public void myTest() {
        System.out.println("Generic");
    }

}

class Tester implements Test {
    public void myTest() {
        System.out.println("Tester");
    }

    public String toString() {
        return "Test toString";
    }
}

class Machine {
    private int myNumber;
}
