import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class FindFiles {
	public static void main(String[] args) throws IOException {
		// toRealPath can through an IOException so this must be caught above or with 
		// a try block.
		System.out.println(Paths.get(".").toRealPath());	
		// This will NOT COMPILE because the depth must be specified as an int.
		// find takes (Path to search from, depth to search from. By default this Integer.MAX, and
		// the filter used for the search.
		// find() method uses a BiPredictate<Path,BasicFileAttribute>, not a Predicate<Path>
		// Files.find(path.getParent(), 10.0, (Path p) -> p.toString().endWith(".txt") && Files.isDirectory(p));

		// Finally, Files.readAllLines() returns a List<String>, not a stream, so the following line, k4, which applies flatMap()
		File.readAllLines(Path)
		.flatMap(p -> Stream.of(p.split(" ")))
		.map(s -> s.toLowerCase())
		.forEach(System.out::println);
	}

}
