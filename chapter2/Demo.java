abstract class Game {
	abstract String getGame();
}

public class Demo {

	public static void main(String args[]){
		Game game = new Game(){
				String getGame(){ 
					return "This is a game";
				}
		};
	}
}
