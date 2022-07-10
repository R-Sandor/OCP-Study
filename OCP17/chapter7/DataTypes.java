public class DataTypes {

	public static void main(String args[]) {
		int one = 1; 
		long two = 2000000000000L;
		double three = 3.0;
		/**
		*
		* Magnitude of long and double are the same, could suffer  a lose of precision but not magnitude.
		*
		* @see https://stackoverflow.com/questions/1293819/why-does-java-implicitly-without-cast-convert-a-long-to-a-float
		* for why no explict cast is required for long to double.
		*/
		double doubles[] = new double[]{ one, two, three};
		double d = 5555L;

		var str = "012345678";
		System.out.println(str.substring(7,7));
		System.out.println(str.substring(7));
		str += 'c';
	}


}
