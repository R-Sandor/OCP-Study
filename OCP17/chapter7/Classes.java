public class Classes {
	public abstract static class InnerStatic {
		public abstract void InnerAbstract();
	}

	public static void main(String[] args){
		InnerStatic myAbstract = new InnerStatic() {
			public void InnerAbstract() {
				System.out.println("InnerAbstract Class");
			};
		};
		myAbstract.InnerAbstract();
	}

}
