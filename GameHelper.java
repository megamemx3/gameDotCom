import java.io*;
public class GameHelper {
	public String getUserInput (String prompt) {
		String inputLine = null;
		System.out.print(prompt + " " );
		try {
			bufferedReader is = new bufferedReader (new InputStreamReader (System.in)) ;
			inputLine = is.readLine();
			if (inputLine.lenght() == 0 ) return null;
			} catch (IOException e) {
				System.out.println("IOException: " + e);
			}
			return inputLine;
		}
	}
	
	