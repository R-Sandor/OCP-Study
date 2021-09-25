import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

/**
	This code shows an example that Paths.equals() method
	only checks that the path are the same not that files that
	the represent are the same.

*/

public class MyPaths {

	public static void main(String ... args) {

		Path p1 = Paths.get("./MyPaths.java");
		Path p2 = Paths.get("../chapter9/../chapter9/MyPaths.java");
		System.out.println("P1 " + p1);
		System.out.println("P2 " + p2);
		System.out.print("Check path equality:\t");
		System.out.println(p1.equals(p2));

		System.out.println("P2 normalized: " + p2.normalize());
		System.out.println("\nCheck with normalization");
		System.out.println(p2.normalize());
		System.out.println("Normalizing doesn't remove the first ../");
		System.out.println(p1.equals(p2.normalize()));
		System.out.println();

		Path p3 = p2.normalize().toAbsolutePath().normalize();
		Path p4 = p2.toAbsolutePath();
		System.out.println("P3:\t" + p3);
		System.out.println("P4=P2.toAbsolutePath().normalize()");
		System.out.println("P4:\t" + p4 + "\n");
		System.out.println();

		System.out.println("To get an absolute and normalized path you really should use toRealPath()");
		System.out.println("but, the exam will throw these questions at you, thus one should know that normalizing should be done after to absolute.");
		System.out.println();

		System.out.println("P1.equals(P2): " + p1.equals(p2.normalize().toAbsolutePath()));
		System.out.println("P1.equals(P3): " + p1.equals(p3));
		System.out.println("P1.toAbsolutePath():\t\t\t" + p1.toAbsolutePath());
		System.out.println("P1.toAbsolutePath().normalize():\t" + p1.toAbsolutePath().normalize());
		System.out.println("P1.toAbsolutePath().equals(P3): " + p1.toAbsolutePath().equals(p3));
		System.out.println("P1.toAbsolutePath().normalize().equals(P3): " + p1.toAbsolutePath().normalize().equals(p3));
		System.out.println();

		System.out.println("A fake path.");
		Path p5 = Paths.get("rabits/../MyPaths.java");
		System.out.println(p5 + "\n");
		System.out.println("As you can see to absolute path add the path to PWD");
		System.out.println(p5.toAbsolutePath() + "\n");
		System.out.println("Same fake path, except absolute.");
		Path p6 = Paths.get("/rabits/../MyPaths.java");
		System.out.println(p6);
		System.out.println("Calling toAbsolutePath() on an absolute path:\n" + p6.toAbsolutePath() + "\n");

		// DON'T DO THIS. isSameFile() method uses Files as a helper.
		// System.out.println(p1.isSameFile(p2)); 
		// This can throw an IOException that must be caught.
		
		System.out.print("Relative Path to an abosolute path:");
		System.out.println("rabits/myPaths/../Cool");
		Path relativeToAbsolute = Paths.get("rabits/myPaths/../Cool").toAbsolutePath();
		System.out.println(relativeToAbsolute);

		try {
			System.out.println();
			System.out.println("finally is the original P1 and P2 same file:\t" + Files.isSameFile(p1, p2));
			System.out.println("NOTE: This had to be placed in a try catch because it can throw IOException and SecurityException");
		
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
