package week5CodingHW;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(buildMessage(log));
		

			
			
		}
		
		
	private String buildMessage(String log) {
		String str = "";
		int i = 0;
		for (i = 0; i < log.length(); i+= 1) {
			str += log.charAt(i) + " ";
	} return str.substring(0, str.length() - 1);
	


	}

	@Override
	public void error(String error) {
		System.out.println(buildErrorMessage(error));
		}	
	
	
		private String buildErrorMessage (String error) {
			System.out.print("ERROR:");
			String str = "";
			int i = 0;
			for (i = 0; i < error.length(); i+= 1) {
				str += error.charAt(i) + " ";
		} return str.substring(0, str.length() - 1);
		
	}
}
