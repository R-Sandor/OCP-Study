public class TextBlock {
	public static void main(String args[]){
	String block = """
		 OMG a string block
	""".indent(1);
//.indent(0);
		System.out.print(block);
	}

}
