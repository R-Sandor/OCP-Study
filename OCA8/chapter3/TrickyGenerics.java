import java.util.*;

public class TrickyGenerics {
    class A {
    }

    class B extends A {
		
		public String toString(){ return "Class B"; }
    }

    <T extends Integer> T method1(List<? extends T> list) {
        return list.get(0);
    }

    public static void main(String args[]) {
        List<Integer> ints = Arrays.asList(1, 3);
        TrickyGenerics tricky = new TrickyGenerics();
        System.out.println(tricky.method1(ints));

        HashSet<Number> hs = new HashSet<Number>();
        hs.add(null);

        // List<? super A> myList = new ArrayList<B>(); // this does not compile
        List<? super A> myList = new ArrayList<A>(); // this should compile
        myList.add(new TrickyGenerics().new B());


		List<Integer> intList = new ArrayList(Arrays.asList(1,2));
		System.out.println(intList);
		System.out.println(intList.get(1));
		intList.add(2, 3);
		System.out.println(intList);
        tricky.method7(myList);

		List<? super Integer> allNumbers = new ArrayList<Number>();
		allNumbers.add(99);
    }

    // Trick here is there are only three allowed options.
    // extends/super/or generic type
    <J extends A> void method7(List<? super B> list) {
        list.get(0);
    }
	/* Not allowed
	<T> void  method4(List<T extends A> list){
		list.get(0);
	}*/


    // This will not compile needs type
    //<?>  void  method6(List list){
    //	list.get(0);
    //}

    // remember when we want anything use ?
    // we can not mix     <X super B>
    <X> void method5(List<? super B> list) {
    }
    // even though we can put any type in for X.

	void method6(List<? super B> list) {
    }
}

