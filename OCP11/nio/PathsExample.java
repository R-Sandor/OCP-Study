import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class PathsExample {

	public static void main(String args[]){
		try {
			Path path = Paths.get("Test");
			boolean result = Files.deleteIfExists(path);
			if (result) System.out.println(path + " is deleted");
			else System.out.println(path + " is not deleted.");
		} catch (IOException e){
			System.out.println("Exception");
		}
	}
}
