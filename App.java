package week5CodingHW;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		System.out.println();
		logger.error("Hello");
		
		System.out.println();
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		System.out.println();
		logger2.error("Hello");
		
	}

}
