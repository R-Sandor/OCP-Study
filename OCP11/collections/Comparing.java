import java.util.Arrays;
import java.util.Comparator;
public class Comparing {
	static class Person implements Comparable<Person> {
		private String name; 
		Person(String name){ this.name = name; }
		@Override
		public int compareTo(Person p){
			return p.name.compareTo(this.name);
		}
	}

	public static void main(String[] args) {
		Person[] people = { new Person("Joe"),
							new Person("Jane"),
							new Person("John") };
		Arrays.sort(people);
		for(Person person: people) { 
			System.out.println(person.name);
		}
	}
}
