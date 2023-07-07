import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;


public class ResourcesApp{
	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
		//System.out.println(resource.getObject(1)); Can not get resource by index
		System.out.println(resource.getObject("HELLO_MSG"));
	}

	public static void main(String[] args){
		new ResourcesApp().loadResourceBundle();
	}

}
