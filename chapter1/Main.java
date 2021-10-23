package chapter1;

interface Claws {
}

class HouseCat implements Claws {

    String trick = "Not trained";

    public void doTrick(String trick) {
        this.trick = trick;
        System.out.println(this.trick);
    }

}


public class Main {
    public static void main(String args[]) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);

        HouseCat kaito = new HouseCat();
        System.out.println("Checking instanceof.. ");
		
		System.out.println(kaito instanceof Claws);

        kaito.doTrick("Meow");
        System.out.println(kaito instanceof BigCat);
    }


}
