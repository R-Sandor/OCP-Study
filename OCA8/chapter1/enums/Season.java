public enum Season {
	WINTER("low"), SPRING("Medium"), SUMMER("High"), FALL("Meduim");
	public String expectedVistors;
	private Season(String expectedVistors){
		this.expectedVistors = expectedVistors;
	}
	public void printExpectedVisitors(){
		System.out.println(expectedVistors);
	}
}


