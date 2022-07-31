class Automobile {}
interface LuxuryModel{}
public class Car extends Automobile {

	public static void main(String... args){
		Automobile auto = new Automobile();
		Truck truck		= new Truck();
		Automobile aTrk	= new Truck();
		Car car 		= new Car();
		BMW bmw			= new BMW();
		Car bmw2		= new BMW();

		System.out.println(truck instanceof Automobile);
		// System.out.println(truck instanceof BMW); // This throws a compiler error. 
													 // The compiler knows truck is not related to BMW
													 // yet, they each share the same parent.
		System.out.println(aTrk instanceof Truck);
		System.out.println(aTrk instanceof BMW);
		System.out.print("Is this a luxury car? ");
		System.out.println(bmw2 instanceof LuxuryModel);
		System.out.println(car instanceof LuxuryModel);
		System.out.println(bmw2 instanceof Automobile);
	}

}
class Truck extends Automobile {}
class BMW extends Car implements LuxuryModel {}



