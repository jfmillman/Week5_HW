package week5CodingHW;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String line = "***" + "Error: " + error + "***";
		String star = "*".repeat(line.length());
		System.out.println(star);
		System.out.println(line);
		System.out.println(star);
		
	}

	
}
