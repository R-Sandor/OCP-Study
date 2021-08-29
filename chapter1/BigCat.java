package chapter1;
//import chapter1.Claws;
public class BigCat implements Claws{
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;
	public final static int test = 0;
    public static void main(String args[]) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);
    }
}
