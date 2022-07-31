import operator.Operator;
public class Engine {
	Operator m = new EngineOperator();
	public void operate() {
		m.turnON();
		m.turnOFF();
	}

	public static void main(String[] args){
		Engine carEngine = new Engine();
		carEngine.operate();
	}
}
