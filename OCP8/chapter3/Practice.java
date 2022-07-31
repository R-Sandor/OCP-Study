import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.time.*;

public class Practice {

    private String myString = "default";

    private void printSomething() {
        System.out.println("printing");
    }

    public void printer() {
        printSomething();
    }

    public String getString() {
        return myString;
    }

    public void setString(String s) {
        myString = s;
    }
}


class Tester {

    public static void main(String args[]) {
        Practice p = new Practice();
        p.printer();
        List<String> s = Arrays.asList("AD");
        //s.add("Voo"); // You can't do this
        //throws unsupported operation error.

        // If we have a list of integers and call
        // remove what happens if we a remove call
        // that is both a index and an element
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println(intList);
        intList.remove(1);
        System.out.println(intList); // uses index first

        System.out.println("--------");
        // Now lets make an ListIterator
        ListIterator<Integer> it = intList.listIterator();
        it.add(0);
//		it.add(3);
        System.out.println(it.next());
//		System.out.println(it.next());
//		it.next();
        it.add(5); // where does iterator add an element?
        //it.next();
        System.out.println(intList); // It places it right before the next
        // element that would be returned by next, if any,
        // and after previous, if any.
        //
        // calling next without there being an element throws an error.
        // NoSuchElement Exception.

        List<Integer> l2 = new ArrayList(intList);
        l2.remove(0);

        System.out.println("--------");

        System.out.println(intList);
        System.out.println(l2);

        // create a date
        LocalDate date = LocalDate.of(98, 5, 21);

        // clone it to a second date
//		LocalDate date2 = date.clone();
//		date2.add(1);
        // print the results
        System.out.println("Original Date:" + date.toString());
        //    System.out.println("Cloned date :" + date2.toString());
        int i = 10;
        int i2 = i;
        i = 12;
        System.out.print(i + " " + i2);
    }

}
