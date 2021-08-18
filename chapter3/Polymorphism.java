import java.util.ArrayList;
import java.util.List;

class Stuff {
    String parent = "Parent";

    public String toString() {
        return parent;
    }
}

public class Polymorphism extends Stuff {

    String whoAmI = "Polly";

    public static void printList(List<?> list) {
        for (Object x : list) System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        // we are able to call this without making an instance
        // of the class because it is static.
        printList(keywords);
        Polymorphism polly = new Polymorphism();
        Stuff stuff = polly;
        Stuff stuff2 = new Polymorphism();
        List pollyList = new ArrayList<>();
        pollyList.add(stuff);
        printList(pollyList);

        System.out.println(stuff.toString());
        System.out.println(stuff2.toString());
    }

    public String toString() {
        return whoAmI;
    }

}
