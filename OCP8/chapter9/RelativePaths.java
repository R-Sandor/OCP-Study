import java.nio.file.Paths;
import java.nio.file.Path;

public class RelativePaths {

	public static void main(String args[]){
		System.out.println();
        System.out.println("-------------");
        System.out.println("Relative to normalized comparison");
        Path orig = Paths.get("/software/././sys/readme.txt");
        System.out.println("Original: " + orig);
        Path norm = orig.normalize();
        System.out.println("Normalized: " + norm);
        Path rel = norm.relativize(orig);
        System.out.println("relative: " + rel);
		System.out.print(orig.getNameCount());
        System.out.print(" : " + norm.getNameCount());
        System.out.println(" : " + rel.getNameCount());
		System.out.println(orig.equals(norm));


		Path path1 = Paths.get("MyPaths.java");
		Path path2 = Paths.get("RelativePaths.java");
		Path path3 = Paths.get("../../OCP/chapter9/MyPaths.java");
		System.out.println("path1: " + path1);
		System.out.println("path2: " + path2);
		System.out.println("path3: " + path3);
		System.out.println("path1.relativize(path2): " + path1.relativize(path2));
		System.out.println("path1.relativize(path3): " + path1.relativize(path3));

		Path path4 = Paths.get("/a/../b");
		Path path5 = Paths.get("/b/test");
		System.out.println(path4.relativize(path5));

	}

}
