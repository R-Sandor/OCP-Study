
public class Finally {
	public static void main(String[] args) throws Exception{
		var finalObj = new Finally();
		finalObj.goHome();
		//throw new RuntimeException("TEST");
	}

	public int goHome() throws Exception {
		var turkey = new Turkey();
		try {
		  System.out.println("1");
		  throw new RuntimeException("Something bad happend");
		} catch (IllegalStateException e) {
			System.out.println(e);
		} finally {
		  turkey.close();
		return 0;
		}
	}
}
class Turkey implements AutoCloseable {

	@Override public void close() throws Exception {
	  	System.out.println("HERE");
		throw new Exception("Turkeys ran off");
	}

}
