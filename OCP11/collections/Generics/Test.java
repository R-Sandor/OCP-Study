class CustomType<T> {
	public <T> int count(T[] anArray, T element) { 
		int count = 0;
		for(T e: anArray) {
			if (e.equals(element)) ++count;
		}
		return count;
	}
}

public class Test extends CustomType {
	public static void main(String[] args) {
		String[] words = {"banna", "orange", "apple", "lemon"};
		Integer[] numbers = {1,2,3,4,5};
		CustomType type = new CustomType();
		CustomType<String> stringType = new CustomType<>();
		System.out.println(stringType.count(words, "apple"));
		System.out.println(type.count(words, "apple"));
		System.out.println(type.count(numbers, 3));
	}
}
	
