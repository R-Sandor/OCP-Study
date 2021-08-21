/**
	Welcome to my minor example of how static imports work.
	If compiled right now it will not succeed. Read over the comments
	and make changes to compile.
*/

/* Step1 no imports. Won't compile needs List and ArrayList. */
/* Step2 you could write your imports like this */
//import java.util.*; // uncomment to test


// import static java.util.Collections.*; // used for the sort.

/*
 * This is also valid for an import. 
 * but this requires to add Collections.sort instead of sort();
*/
//import static java.util.Collections.sort;

//import java.util.*

/* last option for imports */
//import java.util.ArrayList;
//import java.util.List;

public class Imports {

	public List <String> copyAndSortList(List<String> org){
		List<String> list = new ArrayList<String>(org);
		// sort(list); // main way for static imports.
		// Collections.sort(list); // Second way

		return list;
	
	}

}
