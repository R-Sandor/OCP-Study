package chapter1.species;

import chapter1.BigCat;

public class Lynx extends BigCat {
    public static void main(String args[]) {
		/*
        BigCat cat = new BigCat();
        System.out.println(cat.name); // We can acess this it is public
        System.out.println(cat.hasFur); // can't access this since it is not through inheritance
        System.out.println(cat.hasPaws); // Package private, must be made in the same package.
        System.out.println(cat.id); // Nothing but the class can access.
		*/

        // BigCat cat = new Lynx(); You'd think this would but since it's a cat reference
		// we're no longer access through inheritance. It would be accessing the parent, but this is the subclass. 
		Lynx cat = new Lynx();
		System.out.println(cat.name);
        System.out.println(cat.hasFur);
        //System.out.println(cat.hasPaws); Package Private
        //System.out.println(cat.id); Private variable won't compile.

    }
}
