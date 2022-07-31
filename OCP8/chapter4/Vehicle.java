import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
public class Vehicle {

	int vId;
	String vName;
	public Vehicle(int vIdArg, String vNameArg){
		this.vId = vIdArg;
		this.vName = vNameArg;
	}
	public int getVid() { return vId; }
	public String getVName() { return vName; }
	public String toString() {
		return vName;
	}
	
	public static void main(String args[]){
		List<Vehicle> vehicle = Arrays.asList(
			new Vehicle(2, "Car"),
			new Vehicle(3, "Bike"),
			new Vehicle(1, "Truck"));
		vehicle.stream().sorted((v1, v2) -> Integer.compare(v1.getVid(), v2.getVid())).forEach(System.out::println);
		System.out.println();
		vehicle.stream().sorted(Comparator.comparing ((Vehicle v) -> v.getVid())).forEach(System.out::println);
		System.out.println();
		vehicle.stream().map(v -> v.getVid())
			.sorted ().forEach(System.out::println);


		List<String> vals = Arrays.asList("", "George", "", "John", "Jim");
		Long count = vals.stream().filter( x -> !x.isEmpty()).count();
		System.out.println(count);
	
		Stream<Vehicle> resVeh = vehicle.stream().filter(v -> v.getVid() > 2);
		Long ct = resVeh.filter(s -> s.getVName().contains("Car")).count();
		System.out.println();
		System.out.println(ct);

	}
}
