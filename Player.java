package RetroPacManGame;

public class Player {
	private int characterLocation = 0;
	private boolean playerPowered = false;
	private int powerTimer = 0;
	
	// Standard get and set methods for the player location
	public int getCharLocation() {
		return characterLocation;
	}
	
	public void setCharLocation(int newLocation) {
		characterLocation = newLocation;
	}
	
	// The get and set methods for the player powered variable
	public boolean isPlayerPowered() {
		return playerPowered;
	}
	
	public void powerPlayer() {
		playerPowered = true;
	}
	
	public void depowerPlayer() {
		playerPowered = false;
	}
	
	public int getPowerTimer() {
		return powerTimer;
	}
	
	public void incrementTimer() {
		powerTimer = powerTimer + 1;
	}
	
	public void resetTimer() {
		powerTimer = 1;
	}
	
	public int getCharacterPositionX() {
		return characterLocation % 31;
	}
	
	public int getCharacterPositionY() {
		return characterLocation / 31;
	}
	
	public void reset() {
		characterLocation = 0;
	}
	
}
