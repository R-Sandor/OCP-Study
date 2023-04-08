package canyon;
final class FallenException extends Exception {}
final class HikingGear implements AutoCloseable {
	@Override public void close() throws Exception {
		throw new FallenException();
	}
}
public class Cliff {
	public final void climb() throws Exception {
		try (HikingGear gear = new HikingGear()){
			throw new RuntimeException();
		} catch (Exception e) { 
			throw new FallenException();
		}
	}
	public static void main(String... rocks){
		try {
			new Cliff().climb();
		} catch (Throwable t){
			System.out.println(t);
		}
	}
}
