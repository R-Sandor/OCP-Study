public class Manager {
	public static void main(String[] args){
		Season summer = Season.SUMMER;
		summer.expectedVistors = "ok";
		summer.printExpectedVisitors();

		Season summer2 = Season.SUMMER;
		/**
			The expected vistors is static. 
			We can think of enums as a special type of static class.
		/*
		summer2.printExpectedVisitors();
	}

}
