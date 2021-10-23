package Science;

import java.util.function.Function;
enum AreasOfStudy {
	MATH("mth101");
	private final String subjectNumber;
	// Notice that we did not specify is public or private
	// enum constructors are implicitily private.
	AreasOfStudy(String subject) {
		this.subjectNumber = subject;
	}
}
@FunctionalInterface
interface Study {
	abstract int learn(String subject, int duration);
}

public class Scientist {
	public static void main(String args[]){
		final Study s = (x,y) -> {return x==null ? y: y+1;};

		System.out.println(s.learn("cool", 1));
	}
	 abstract protected class College {}

}