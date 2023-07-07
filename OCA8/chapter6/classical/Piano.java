package classical;
import java.io.*;
class OutOfTuneException extends Exception {
	OutOfTuneException(String message){
		super(message);
	}
}

public class Piano {
	public void play() throws OutOfTuneException, FileNotFoundException {
		throw new OutOfTuneException("Sour Note");
	}
	public static void main(String args[]) throws OutOfTuneException {
		final Piano piano = new Piano();
		try {
			piano.play();
		} catch(Exception e){
			throw new OutOfTuneException("test");
		} finally {
			System.out.println("Song Finished");
		}
	}
}
