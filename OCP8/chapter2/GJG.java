// Java code for Stream flatMapToInt
// (Function mapper) to get an IntStream
// consisting of the results of replacing
// each element of this stream with the
// contents of a mapped stream.
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG",
                                          "GeeksforGeeks", "gfg");
  
        // Using Stream flatMapToInt(Function mapper)
        // to get length of all strings present in list
        list.stream().flatMapToInt(str -> IntStream.of(str.length())).
        forEach(System.out::println);

		list.stream().map( str -> str.length()).collect(Collectors.toList());
    }
}
