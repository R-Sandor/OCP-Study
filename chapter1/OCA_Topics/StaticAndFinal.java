abstract class MyClass {
	// final and static are fine on this variable too.
	final static String id = "classID";
	// static on this and the subclass are fine.
	// but it's not truly overriding it is hidding.
	static void clean() {}
}

public class StaticAndFinal extends MyClass{
	
	static void clean() {}

}
