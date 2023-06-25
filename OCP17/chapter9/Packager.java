/**
 * Sample class to demonstrate various errors and gotchas of 
 * generic programming.
 */

import java.util.List; 
import java.util.ArrayList;

class Packaging { } 
class Bag extends Packaging {}
class Envelope extends Bag {}
class Box extends Packaging {} 

class StickerLabel <E extends Bag> {
  public void apply() { 
    System.out.println("Applying Label");
  }
}  

class Carrier { 
  private List<Packaging> shipment = new ArrayList<>(); 


  /** 
      This method should not work because it extends.
      because Extends creates an list could take a list of Packaging, List<Bag>, List<Box>
      it will allow deletion... 
  */
  /** public void addToShipment(List<? extends Packaging> readyToShip) {
    readyToShip.add(new Packaging());
  }*/

  public void addToShipment(List<? super Packaging> readyToShip) {
    readyToShip.add(new Packaging());
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
