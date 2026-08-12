package RetroPacManGame;

public class Score {
	private int score = 0;
	
	// Provides the standard get and set methods for the score value
	public int getScore() {
		return score;
	}
	
	public void setScore(int newScore) {
		score = newScore;
	}
	
	// Allows the score to be increased by 1 
	public void incrementScore () {
		score = score + 1;
	}
	
	public void reset() {
		score = 0;
	}
}
