import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePaths {
	public static void main(String[] args){
		Path path1 = Paths.get("/cool/beans");
		Path path2 = Paths.get("gravy/Train");
		Path path3 = Paths.get("mashed_potatoes");
		Path rels  = path2.resolve(path3);
		Path resolved = path1.resolve(path2);
		System.out.println(resolved);
		System.out.println(rels);
	}

}
