import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Lambdas {

	interface FancyFunc {
		void doSomething(int x);
	}

	public static Object calc(int i){
		return (Object) 2;

	}

	public void doer(FancyFunc fancyFunc){
		
	}

	public static void main(String args[]) {
		
        ExecutorService service = Executors.newSingleThreadExecutor();
		Lambdas lambda = new Lambdas();	
		IntStream.range(100,105)
			.forEach(i -> System.out.println(i));
		final List<Future<?>> results = new ArrayList<Future<?>>();
	    IntStream.range(100, 105)
        .forEach(i ->
		 	{
				results.add(service.submit(() -> calc(i)));
			}); // a2
      service.shutdown();
	}


}
