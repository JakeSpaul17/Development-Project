package RetroPacManGame;

public class Ghost {
	private int ghostLocation = 0;
	private int previousLocation = 0;
	private int currentLocationValue = 9;
	private int startingLocation = 0;
	private boolean ghostActive = true;
	private int reviveTimer = 0;
	
	public int getGhostLocation() {
		return ghostLocation;
	}
	
	// Standard get and set methods for the ghost location
	public void setGhostLocation(int newLocation) {
		ghostLocation = newLocation;
	}
	
	public int getPreviousLocation() {
		return previousLocation;
	}
	
	// Standard get and set methods for the previous location
	public void setPreviousLocation(int newLocation) {
		previousLocation = newLocation;
	}
	
	// Standard get and set methods for the location value
	public int getCurrentLocationValue() {
		return currentLocationValue;
	}
	
	public void setCurrentLocationValue(int newValue) {
		currentLocationValue = newValue;
	}
	
	public int getGhostPositionX() {
		return ghostLocation % 31;
	}
	
	public int getGhostPositionY() {
		return ghostLocation / 31;
	}
	
	// Standard get method for Ghost Active
	public boolean getGhostActive() {
		return ghostActive;
	}
	
	// Set methods for Ghost Active
	public void setGhostAlive() {
		ghostActive = true;
	}
	
	public void setGhostDead() {
		ghostActive = false;
	}
	
	public int getReviveTimer() {
		return reviveTimer;
	}
	
	public void incrementTimer() {
		reviveTimer = reviveTimer + 1;
	}
	
	public void resetTimer() {
		reviveTimer = 1;
	}
	
	// Get and set methods for ghost startng location
	public int getStartingLocation() {
		return startingLocation;
	}
	
	public void setStartingLocation(int location) {
		startingLocation = location;
	}
	
	public void reset() {
		ghostLocation = 0;
		previousLocation = 343;
		currentLocationValue = 9;
		ghostActive = true;
		reviveTimer = 0;
	}
}
