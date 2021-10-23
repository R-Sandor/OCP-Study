import java.util.concurrent.Callable;
import java.util.concurrent.*;
public class Cached {

	class ThreadRunner implements Runnable {
		public void run () { System.out.println ("Runnable") ; }
	}

	class ThreadCaller implements Callable {
		public String call () throws Exception {return "Callable"; }
	}
	
	public static void main(String args[]){
		ExecutorService es = Executors.newCachedThreadPool ();
		Cached cached = new Cached();
		Runnable r1 =  cached.new ThreadRunner ();
		Callable c1 =  cached.new ThreadCaller ();
		es.submit(r1);
		Future<String> f1 = es.submit (c1);
		es.shutdown();
	}

}
