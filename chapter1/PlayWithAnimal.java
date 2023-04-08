/**
 Demonstration of virtual method invocation. 
 Virtual method invocation does not work for instance variables.

 If a method that exists in the parent class gets instance variable
 regardless of if the child has the variable or not it will return the parents.

 The way around that is to create the same method in the child there for the 
 call will be from the perspective of the child.

*/

abstract class Animal {
	String name = "???";
	public void printName() {
		System.out.println(name);
	}
}

class Lion extends Animal {
	String name = "Leo";
}

public class PlayWithAnimal {
	public static void main(String... args) {
		Lion animal = new Lion();
		animal.printName();
	}
}


