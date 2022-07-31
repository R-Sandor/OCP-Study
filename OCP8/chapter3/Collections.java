import java.util.*;

public class Collections {

    public static void main(String args[]) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(100);
        myInts.add(144);
        myInts.add(344);

        Iterator<Integer> iter = myInts.iterator();
        System.out.println(iter);
        while (iter.hasNext()) {
            int i = iter.next();
            System.out.println(i);
            System.out.println(iter);
        }

    }


}
