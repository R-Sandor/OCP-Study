public class DataConverter {
	public void copyFlatFilesToTables() {}
	public void close() throws Exception {
		throw new RuntimeException();
	}

	public static void main(String args[]) throws Exception {
		try ( DataConverter dc = new DataConverter()){
				dc.copyFlatFilesToTables();
			}
	}
}
