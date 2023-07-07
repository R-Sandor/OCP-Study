package serialization;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serializer {
  public static void main(String args[]) throws IOException {
    try( var out = new ObjectOutputStream(
                      new BufferedOutputStream(
                        new FileOutputStream("animal_data")))) {
      out.writeObject(new Cat());
    } 
  }
}
