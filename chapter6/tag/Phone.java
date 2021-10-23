package tag;
class MissedCallException extends Exception {}
public class Phone {

	static void makeCall() throws RuntimeException {
		throw new ArrayIndexOutOfBoundsException("Call");
	}

	public static void main(String[] args){
		try {
			makeCall();
		} 
			// There is not any possible way for this exception to occur.
			// there for the code doesn't compile.
		catch (MissedCallException e){
			throw new RuntimeException("VoiceMail");
		} finally {
			throw new RuntimeException("Text");
		}

	}

}
