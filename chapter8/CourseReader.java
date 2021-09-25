import java.io.InputStreamReader;
import java.io.FileInputStream;



public class CourseReader {

public static void main (String[ ] args)
{
	int i;
	char c;
	try (FileInputStream fis = new FileInputStream ("course.txt");
	InputStreamReader isr = new InputStreamReader(fis);) {
		while (isr.ready())
		{
			//line n1
			isr.skip(2);
			i = isr.read ();
			c = (char) i;
			System.out.print(c);
		}
	} catch (Exception e){
		e.printStackTrace();
	}
}
}
