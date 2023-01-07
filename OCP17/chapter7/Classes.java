public class Classes {
	public abstract static class InnerStatic {
		public abstract void InnerAbstract();
	}

	public static abstract class SecondClass {
	}

	public static void main(String[] args){
		InnerStatic myAbstract = new InnerStatic() {
			public void InnerAbstract() {
				System.out.println("InnerAbstract Class");
			};
		};
		myAbstract.InnerAbstract();
		innerStatic(new SecondClass(){});	
	}

	public static void innerStatic(SecondClass is) {
		System.out.println("inner static class");
	}
}
