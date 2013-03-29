public class SimpleDotCom {
int [] locationsCells;
int numOfHits = 0;

	public void setlocationCells (int[] cellLocations) {
	locationsCells = cellLocations;
	}
	public String checkYourself(String userGuess) {
	int guess = Integer.parseInt(userGuess);
	String result = "miss";
	for(int cell : locationsCells) {
		if (guess == cell) {
			result = "hit";
			numOfHits++;
			break;
		} // Fim do teste if
	} // Fim do loop for
		if (numOfHits == locationsCells.length) {
			result = "kill";
		} //Fim do teste IF
		System.out.println(result);
		return result;
	} //Fim do método
	} //Fim a Classe

