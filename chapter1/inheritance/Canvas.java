/**
	Everything compiles because Paper's draw method
	is an overload rather than an override. 
	If we made it a no-arguement method then the 
	the code will not compile.
*/
public class Canvas implements Drawable {
	public void draw (){}
}

abstract class Board extends Canvas {}

class Paper extends Canvas {
	protected void draw (String color){
	}
}

class Frame extends Canvas implements Drawable {
	public void resize (){}
}

interface Drawable {
	abstract void draw ();
}
