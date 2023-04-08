import java.io.*;
class Tail {}
public class Bird implements Serializable {

	public Bird(String name, int age){
		this.name = name;
		this.age = age;
	}

	private String name;
    private transient int age;
    private transient Tail tail;
    public String getName() { return name; }
    public Tail getTail() { return tail; }
    public void setName(String name) { this.name = name; }
    public void setTail(Tail tail) { this.tail = tail; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
	public String toString(){ return name + " " + age; }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	try(ObjectOutputStream os = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("birds.dat")))) {
			os.writeObject(new Bird("Jimmy", 2));
			
		}
		
		readBirdObject();
   }

   private static void readBirdObject() throws IOException, ClassNotFoundException {
		try(ObjectInputStream in = new ObjectInputStream(
		new BufferedInputStream(new FileInputStream("birds.dat")))) {
		Object object = in.readObject();
		if (object instanceof Bird){
				Bird bird = (Bird) object;
				System.out.println("Got the bird");
				System.out.println(bird);
			}
		} //catch (EOFException e){}
   }
}
