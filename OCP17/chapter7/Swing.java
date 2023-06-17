interface Fun {
   static int timing = 20;
   int dance();
}
abstract class Dance {
   static int timing = 10;
   abstract int dance();
}
public final class Swing extends Dance implements Fun {
   public int dance() { return 596; }
   public static void main(String[] args) {
      System.out.print(new Swing().dance());
   } 
}
