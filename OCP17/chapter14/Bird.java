import java.io.*;
public class Bird implements Serializable {
  private String name;
  private transient Integer age;

 
  private void readObject(ObjectInputStream in)  
             throws IOException, ClassNotFoundException {
			 System.out.println("readObject");	 
              // read the non static fields  
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
	var is =  new ObjectInputStream(
					new BufferedInputStream(
 						  new FileInputStream("birds.dat")));
    try {
	  Bird b = (Bird) is.readObject();
	  System.out.println(b.age);
	} catch (ClassNotFoundException | IOException ex) {
		System.out.println("FileNotFound");
	}
	finally {
		try { 
			is.close();	
		} catch (IOException ex){
			System.out.println("IOException");
		}

	}

  }


}
