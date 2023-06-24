class Packaging { } 
class Bag extends Packaging {}
class Envelope extends Bag {}
class Box extends Packaging {} 

class StickerLabel <E extends Bag> {
  public void apply() { 
    System.out.println("Applying Label to" + E );
  }
}  

public class Packager { 

  public static void main(String... args){
    StickerLabel<Bag> sl1 = new StickerLabel<Bag>();
    // Does not compile must be in the bounds of E!
    // StickerLabel<? super Bag> sl2 = new StickerLabel<Packaging>(); 

    // Compiles in the bounds of E!
    StickerLabel<? super Bag> sl2 = new StickerLabel<Bag>(); 
    sl1.apply();
  }
}
