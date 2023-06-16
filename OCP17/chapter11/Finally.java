
public class Finally {
	public static void main(String[] args) throws Exception{
		var finalObj = new Finally();
		finalObj.goHome();
		//throw new RuntimeException("TEST");
	}

	public int goHome() throws Exception { 
		var turkey = new Turkey();
		try(turkey) {
		  System.out.println("1");
		  throw new RuntimeException("Something bad happend");
		} catch (IllegalStateException e) {
			System.out.println(e);
		} finally {
      System.out.println("Finally Swallows the exception");
		  //return 0; // Comment out to see execption. 
		}
    return 0; // uncomment if line 18 is commented out.
	}
}

class Turkey implements AutoCloseable {
	@Override public void close() throws Exception {
	  	System.out.println("Close method");
		throw new Exception("Turkeys ran off");
	}

}
