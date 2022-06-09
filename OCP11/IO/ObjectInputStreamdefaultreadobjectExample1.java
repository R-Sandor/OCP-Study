    import java.io.*;  
    public class ObjectInputStreamdefaultreadobjectExample1 {  
       public static void main(String[] args) {  
          try {  
               // create a new file with an ObjectOutputStream  
             FileOutputStream outstream = new FileOutputStream("file1.txt");  
             ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);  
      
             // write something in the file  
             objoutstream.writeObject(new Task());  
             objoutstream.flush();  
      
             // create an ObjectInputStream for the file we created before  
             ObjectInputStream objInputstram = new ObjectInputStream(new FileInputStream("file1.txt"));  
      
             // read the object and print the string  
             // Object obj1 =  objinputstram.readObject();  
             Task obj1 = (Task)  objInputstram.readObject();  
			 System.out.println(obj1);
          } catch (Exception ex) {  
             ex.printStackTrace();  
          }  
       }  
       static class Task implements Serializable {  
          String s = "javaTpoint";  
             // using defaultReadObject() with read() method  
          private void readObject(ObjectInputStream in)  
             throws IOException, ClassNotFoundException {
			 System.out.println("readObject");	 
              // read the non static fields  
             in.defaultReadObject();  
          }  
		  @Override
		  public String toString(){
			return this.s;
		  }
       }  
    }  
