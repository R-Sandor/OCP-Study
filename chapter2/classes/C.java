
class A {


}
class B extends A{
	public B(){}
	public B(A a){
		System.out.println("Takes parent");
	}

}

public class C extends B {

	public static void main(String args[]){
		C c = new C();
	}
	public C(){
		super(new B());
	}
}
