package RetroPacManGame;

public class Game{
	private int[] board = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, // The array containing the game board's values
					0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
					0,6,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,6,0,
					0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
					0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,
					0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,
					0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,
					0,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,
					0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,
					0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,
					0,1,1,1,1,1,1,1,0,0,1,1,1,1,3,4,5,1,1,1,1,0,0,1,1,1,1,1,1,1,0,
					0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,
					0,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,
					0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,
					0,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,0,1,0,
					0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,
					0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,1,0,
					0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,2,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,
					0,6,1,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,6,0,
					0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,
					0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,
					0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,
					0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
					0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
					};
	private int[] defaultBoard = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, // The array containing the game board's default values
								0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
								0,6,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,6,0,
								0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
								0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,
								0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,
								0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,
								0,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,
								0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,
								0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,
								0,1,1,1,1,1,1,1,0,0,1,1,1,1,3,4,5,1,1,1,1,0,0,1,1,1,1,1,1,1,0,
								0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,
								0,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,
								0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,
								0,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,0,1,0,
								0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,
								0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,1,0,
								0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,2,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,
								0,6,1,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,6,0,
								0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,
								0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,
								0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,
								0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,
								0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
								};
	// Creating classes to use within the game
	private Player player = new Player(); 
	private Score score = new Score();
	private Ghost ghost1 = new Ghost();
	private Ghost ghost2 = new Ghost();
	private Ghost ghost3 = new Ghost();
	
	
	public static final String RESET = "\033[0m";  // Reset all attributes
    public static final String WALL_ANSI = "\033[34;44mw";  // ANSI Blue wall
    public static final String WALL_ANSI_NEWLINE = "\033[34;44mw\n";  // ANSI Blue wall
    public static final String CHARACTER_ANSI  ="\033[38;5;226mC"; // ANSI Yellow Character
    public static final String CHARACTER_POWERED_ANSI  ="\033[33;46mC"; // ANSI Yellow Character
    public static final String GHOST1_ANSI = "\033[31mG";   // ANSI Ghost 1 - Red
    public static final String GHOST2_ANSI = "\033[32mG"; // ANSI Ghost 2 - Green
    public static final String GHOST3_ANSI = "\033[35mG"; // ANSI Ghost 3 - Magenta
    public static final String BASE_ANSI = "\033[49mb"; // ANSI Base - Back White
    public static final String CLEAR_SCREEN = "\033[2J"; // Clear screen
    public static final String MOVE_CURSOR = "\033[%d;%dH"; // Move cursor to row, col
    
    // Constants used throughout the code to make it more readable and easily understandable for what each bit does
    public static final int SPACE = -1;
    public static final int WALL = 0;
    public static final int COIN = 1;
    public static final int CHARACTER = 2;
    public static final int GHOST1 = 3;
    public static final int GHOST2 = 4;
    public static final int GHOST3 = 5;
    public static final int POWER_UP = 6;
    public static final int BASE = 9;
    public static final int UP = -31;
    public static final int DOWN = 31;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;
    public static final char UP_CHAR = 'w';
    public static final char DOWN_CHAR = 's';
    public static final char LEFT_CHAR = 'a';
    public static final char RIGHT_CHAR = 'd';
    public static final int GHOST1_HOME = 324;
    public static final int GHOST2_HOME = 325;
    public static final int GHOST3_HOME = 326;
	
    
    // Performs any set ups for the game before it starts
    public void gameSetUp() {
    	ghost1.setStartingLocation(GHOST1_HOME);
    	ghost1.setPreviousLocation(GHOST2_HOME);
    	ghost2.setStartingLocation(GHOST2_HOME);
    	ghost2.setPreviousLocation(GHOST3_HOME);
    	ghost3.setStartingLocation(GHOST3_HOME);
    	ghost3.setPreviousLocation(GHOST2_HOME);
    }
    
    
    // Method for outputting the board
    public void printBoard() {
    	if (player.isPlayerPowered() == true) {
    		if (player.getPowerTimer() == 20) {
    			player.depowerPlayer();
    			player.resetTimer();
    		} else {
    			player.incrementTimer();
    		}
    	}
    	System.out.printf(MOVE_CURSOR, 10, 10); // Moves the Cursor to the specified location
    	System.out.println("Score: " + score.getScore() + "\n"); // Outputs the current score for the game
    	for (int i=0; i<board.length; i+=1) { // A loop to go through each item in the array
        	if (board[i] == WALL) { // Determines if the current space is a wall space
        		if (i%31==30) { // Determines if the wall is at the end of a line 
        			System.out.print(WALL_ANSI_NEWLINE + RESET);
        		} else {
        			System.out.print(WALL_ANSI + RESET);

        		}
        	} else if (board[i] == COIN){ // Determines if the current space is a coin space
        		System.out.print(".");
        	} else if (board[i] == SPACE){ // Determines if the current space is a blank space
        		System.out.print(" ");
        	} else if (board[i] == CHARACTER){ // Determines if the current space is the character space
        		if (player.isPlayerPowered() == true) System.out.print(CHARACTER_POWERED_ANSI + RESET); 
        		else System.out.print(CHARACTER_ANSI + RESET); 
        		player.setCharLocation(i);
        	} else if (board[i] == GHOST1){ // Determines if the current space is a ghost 1 space
        		System.out.print(GHOST1_ANSI + RESET);
        		ghost1.setGhostLocation(i);
        	} else if (board[i] == GHOST2) { // Determines if the current space is a ghost 2 space
        		System.out.print(GHOST2_ANSI + RESET);
        		ghost2.setGhostLocation(i);
    		} else if (board[i] == GHOST3) { // Determines if the current space is a ghost 3 space
        		System.out.print(GHOST3_ANSI + RESET);
        		ghost3.setGhostLocation(i);
    		} else if (board[i] == BASE){ // Determines if the current space is a base space
        		System.out.print(BASE_ANSI + RESET);
        	} else if (board[i] == POWER_UP) { // Determines if the current space is a power up space
        		System.out.print("o");
        	} else {
        		System.out.print(" ");
        	}
    	}
    }
    	
    
    public void charMove(char direction) {
		int moveChar = 0; // Creates the empty value for the next space to be updated within the if statements if applicable
    	// The if statements detect if an appropriate input has been entered, then store the information for the space in that direction from the player
		if (direction == UP_CHAR) { 
        	moveChar = player.getCharLocation() + UP; 
    	} else if (direction == LEFT_CHAR) {
        	moveChar = player.getCharLocation() + LEFT;
    	} else if (direction == DOWN_CHAR) {
        	moveChar = player.getCharLocation() + DOWN;
    	} else if (direction == RIGHT_CHAR) {
        	moveChar = player.getCharLocation() + RIGHT;
    	}
    	if (board[moveChar] != WALL && board[moveChar] != BASE) { // Determines if the position is a wall or base to prevent the character moving to those types of space
    		if (board[moveChar] == COIN) { // Determines if the new space has a coin to determine if the score needs to be incremented
    			score.incrementScore();
    		} else if (board[moveChar] == POWER_UP) { // Determines if the space being moved to is a power up space
    			player.powerPlayer(); // Grants the player the benefits of the power up
    		}
    		board[moveChar] = CHARACTER; // Places the character onto the new space
    		board[player.getCharLocation()] = SPACE; // Makes the old space an empty space 
    	}
    }
    
    public void ghostMove(int ghostNumber) {
    	
    	int moveChar = 0;
    	int location = 0; // Stores the location of the ghost to utilise later
    	int locationValue = 0; // Acquires the locations value to assign after the ghost has moved
    	int previousLocation = 0;
    	boolean ghostStatus = true;
    	if (ghostNumber == 1) { // Updates the position values for if it is Ghost 1
    		location = ghost1.getGhostLocation();
    		locationValue = ghost1.getCurrentLocationValue();
    		previousLocation = ghost1.getPreviousLocation();
    		ghostStatus = ghost1.getGhostActive();
    	} else if (ghostNumber == 2) { // Updates the position values for if it is Ghost 1
    		location = ghost2.getGhostLocation();
    		locationValue = ghost2.getCurrentLocationValue();
    		previousLocation = ghost2.getPreviousLocation();
    		ghostStatus = ghost2.getGhostActive();
    	} else if (ghostNumber == 3) { // Updates the position values for if it is Ghost 1
    		location = ghost3.getGhostLocation();
    		locationValue = ghost3.getCurrentLocationValue();
    		previousLocation = ghost3.getPreviousLocation();
    		ghostStatus = ghost3.getGhostActive();
    	}
    	if (ghostStatus == false) {
    		if (ghostNumber == 1) {
    			if (ghost1.getReviveTimer() == 10) {
    				ghost1.setGhostAlive();
    				ghost1.resetTimer();
    			} else {
    				ghost1.incrementTimer();
    			}
    		} else if (ghostNumber == 2) {
    			if (ghost2.getReviveTimer() == 10) {
    				ghost2.setGhostAlive();
    				ghost2.resetTimer();
    			} else {
    				ghost2.incrementTimer();
    			}
    		} else if (ghostNumber == 3) {
    			if (ghost3.getReviveTimer() == 10) {
    				ghost3.setGhostAlive();
    				ghost3.resetTimer();
    			} else {
    				ghost3.incrementTimer();
    			}
    		}
    	} else if (ghostStatus == true) {
	    	boolean condition = false; // Keeps the while loop to decide a direction repeating until a direction has been chosen
	    	while (condition == false) { // While loop to repeat move selection until appropriate
	    		if ((int)(Math.random() * 5) == 1) { // Causes the suggested move to have a 25% chance of occurring
	    			String[] suggestion = suggestedGhostMove(ghostNumber); //Get's the suggested move
	    			int directionChoice = 0; // Defaults the suggested to the first element of the array
	    			if (suggestion[1] != "") { // Randomly picks 1 or 2 to decide which direction to pick if the 2nd element is not empty
	    	    		int[] optionChoice = {0,0,1};
	    	    		directionChoice = optionChoice[(int)(Math.random() * 3)];
	    			}
	    			// Moves the character in the suggested direction
	    			if (suggestion[directionChoice] == "Up") {
	    				moveChar = location + UP;
	    			} else if (suggestion[directionChoice] == "Down") {
	    				moveChar = location + DOWN;
	    			} else if (suggestion[directionChoice] == "Left") {
	    				moveChar = location + LEFT;
	    			} else if (suggestion[directionChoice] == "Right") {
	    				moveChar = location + RIGHT;
	    			}
	    		} else {
	    			int randomDirection = (int)(Math.random() * 5); // Picks a random direction if the suggested move is not used
	    			// The if statements assign the appropriate direction to the moveChar value 
	    			if (randomDirection == 1) {
	    				moveChar = location + UP;
	    			} else if (randomDirection == 2) {
	    				moveChar = location + LEFT;
	    			} else if (randomDirection == 3) {
	    				moveChar = location + DOWN;
	    			} else {
	    				moveChar = location + RIGHT;
	    			}
	    		}
	    		if (board[moveChar] != WALL && moveChar != previousLocation) { 
	    		// Detects if the space the ghost is planning to move to is a wall space or the previous space the ghost was on
	    			condition = true; // Ends the while loop as a valid direction has been chosen
	    			if (ghostNumber == 1) { // Applies the move to ghost 1 if that was the ghost selected to move
	    				ghost1.setCurrentLocationValue(board[moveChar]); // Updates the location value before moving
	    				ghost1.setPreviousLocation(location); // Updates the previous location before moving
	    				board[moveChar] = GHOST1; // Places the ghost  onto the new space
	    				board[location] = locationValue; // Reassigns the previous spaces original value
	    			} else if (ghostNumber == 2) { // Applies the move to ghost 2 if that was the ghost selected to move
	    				ghost2.setCurrentLocationValue(board[moveChar]); // Updates the location value before moving
	    				ghost2.setPreviousLocation(location); // Updates the previous location before moving
	    				board[moveChar] = GHOST2; // Places the ghost  onto the new space
	    				board[location] = locationValue; // Reassigns the previous spaces original value
	    			} else if (ghostNumber == 3) { // Applies the move to ghost 2 if that was the ghost selected to move
	    				ghost3.setCurrentLocationValue(board[moveChar]); // Updates the location value before moving
	    				ghost3.setPreviousLocation(location); // Updates the previous location before moving
	    				board[moveChar] = GHOST3; // Places the ghost  onto the new space
	    				board[location] = locationValue; // Reassigns the previous spaces original value
	    			}
	    		}
	    	}
    	}

    	
    }
    
    public String[] suggestedGhostMove(int ghostNumber) {
    	String[] suggestedMove = {"",""}; // Creates the empty suggested move for the if statement to change
    	boolean wall1Check = false; // Three checks to determine if walls or the previous spot is in the desired directions
    	boolean wall2Check = false;
    	boolean previousSpotCheck = false;
    	int x = 0; // Created to acquire the ghost's X and Y positions
    	int y = 0;
    	int ghostLocation = 0; // To acquire ghosts current location
    	int ghostPrevious = 0; // To acquire the ghosts previous location
    	if (ghostNumber == 1) { // Updates the position values for if it is Ghost 1
    		x = ghost1.getGhostPositionX();
    		y = ghost1.getGhostPositionY();
    		ghostLocation = ghost1.getGhostLocation();
    		ghostPrevious = ghost1.getPreviousLocation();
    	} else if (ghostNumber == 2) { // Updates the position values for if it is Ghost 2
    		x = ghost2.getGhostPositionX();
    		y = ghost2.getGhostPositionY();
    		ghostLocation = ghost2.getGhostLocation();
    		ghostPrevious = ghost2.getPreviousLocation();
    	} else if (ghostNumber == 2) { // Updates the position values for if it is Ghost 3
    		x = ghost3.getGhostPositionX();
    		y = ghost3.getGhostPositionY();
    		ghostLocation = ghost3.getGhostLocation();
    		ghostPrevious = ghost3.getPreviousLocation();
    	}
    	//Up Left
    	if (player.getCharacterPositionY() <= y) { // Determines if Player is above or on same row as the ghost
    		if (player.getCharacterPositionX() <= x) { // Determines if the player is left or on same column as player
    			if (board[ghostLocation + UP] == WALL) { // Checks if space above is a wall
    				wall1Check = true;
    			}
    			if (board[ghostLocation + LEFT] == WALL) { // Checks if space left is a wall
    				wall2Check = true;
    			}
    			if (ghostLocation + UP == ghostPrevious || ghostLocation + LEFT == ghostPrevious) { // Checks if the previous spot is up or left of ghost
    				previousSpotCheck = true;
    			}
    			if ((wall1Check == true && wall2Check == true) || (previousSpotCheck == true && (wall1Check == true || wall2Check == true))) {
    				// Checks if Up and Left are both walls or are the previous spot and a wall
    				suggestedMove[0] = "Down";
    				suggestedMove[1] = "Right";
    			} else if ((wall1Check == true || wall2Check == true) || (previousSpotCheck == true || (wall1Check == true || wall2Check == true))) { 
    				// Checks if one of the spaces is a wall or previous space
    				if (board[ghostLocation + UP] == WALL || board[ghostLocation + UP] == ghostPrevious) { // Checks if space Up is the wall or previous spot
    					suggestedMove[0] = "Left";
    				} else {
    					suggestedMove[0] = "Up";
    				}
    			} else { //Both Up and Left should not be walls or the previous spot at this point
    				suggestedMove[0] = "Up";
    				suggestedMove[1] = "Left";
    			}
    		} // Up Right
    		else if (player.getCharacterPositionX() > x){
    			if (board[ghostLocation + UP] == WALL) { // Checks if space above is a wall
    				wall1Check = true;
    			}
    			if (board[ghostLocation + RIGHT] == WALL) { // Checks if space right is a wall
    				wall2Check = true;
    			}
    			if (ghostLocation + UP == ghostPrevious || ghostLocation + RIGHT == ghostPrevious) { // Checks if the previous spot is up or right of ghost
    				previousSpotCheck = true;
    			}
    			if ((wall1Check == true && wall2Check == true) || (previousSpotCheck == true && (wall1Check == true || wall2Check == true))) {
    				// Checks if Up and Right are both walls or are the previous spot and a wall
    				suggestedMove[0] = "Down";
    				suggestedMove[1] = "Left";
    			} else if ((wall1Check == true || wall2Check == true) || (previousSpotCheck == true || (wall1Check == true || wall2Check == true))) { 
    				// Checks if one of the spaces is a wall or previous space
    				if (board[ghostLocation + UP] == WALL || board[ghostLocation + UP] == ghostPrevious) { // Checks if space Up is the wall or previous spot
    					suggestedMove[0] = "Right";
    				} else {
    					suggestedMove[0] = "Up";
    				}
    			} else { //Both Up and Right should not be walls or the previous spot at this point
    				suggestedMove[0] = "Up";
    				suggestedMove[1] = "Right";
    			}
    		}
    	}
    	//Down Left
    	else if (player.getCharacterPositionY() > y) {
    		if (player.getCharacterPositionX() <= x) {
    			if (board[ghostLocation + DOWN] == WALL) { // Checks if space below is a wall
    				wall1Check = true;
    			}
    			if (board[ghostLocation + LEFT] == WALL) { // Checks if space left is a wall
    				wall2Check = true;
    			}
    			if (ghostLocation + DOWN == ghostPrevious || ghostLocation + LEFT == ghostPrevious) { // Checks if the previous spot is down or left of ghost
    				previousSpotCheck = true;
    			}
    			if ((wall1Check == true && wall2Check == true) || (previousSpotCheck == true && (wall1Check == true || wall2Check == true))) {
    				// Checks if Down and Left are both walls or are the previous spot and a wall
    				suggestedMove[0] = "Up";
    				suggestedMove[1] = "Right";
    			} else if ((wall1Check == true || wall2Check == true) || (previousSpotCheck == true || (wall1Check == true || wall2Check == true))) { 
    				// Checks if one of the spaces is a wall or previous space
    				if (board[ghostLocation + DOWN] == WALL || board[ghostLocation + DOWN] == ghostPrevious) { // Checks if space Down is the wall or previous spot
    					suggestedMove[0] = "Left";
    				} else {
    					suggestedMove[0] = "Down";
    				}
    			} else { //Both Down and Left should not be walls or the previous spot at this point
    				suggestedMove[0] = "Down";
    				suggestedMove[1] = "Left";
    			}
    		} // Down Right
    		else if (player.getCharacterPositionX() > x){
    			if (board[ghostLocation + DOWN] == WALL) { // Checks if space below is a wall
    				wall1Check = true;
    			}
    			if (board[ghostLocation + RIGHT] == WALL) { // Checks if space right is a wall
    				wall2Check = true;
    			}
    			if (ghostLocation + DOWN == ghostPrevious || ghostLocation + RIGHT == ghostPrevious) { // Checks if the previous spot is down or right of ghost
    				previousSpotCheck = true;
    			}
    			if ((wall1Check == true && wall2Check == true) || (previousSpotCheck == true && (wall1Check == true || wall2Check == true))) {
    				// Checks if Down and Right are both walls or are the previous spot and a wall
    				suggestedMove[0] = "Up";
    				suggestedMove[1] = "Left";
    			} else if ((wall1Check == true || wall2Check == true) || (previousSpotCheck == true || (wall1Check == true || wall2Check == true))) { 
    				// Checks if one of the spaces is a wall or previous space
    				if (board[ghostLocation + DOWN] == WALL || board[ghostLocation + DOWN] == ghostPrevious) { // Checks if space Up is the wall or previous spot
    					suggestedMove[0] = "Right";
    				} else {
    					suggestedMove[0] = "Down";
    				}
    			} else { //Both Up and Left should not be walls or the previous spot at this point
    				suggestedMove[0] = "Down";
    				suggestedMove[1] = "Right";
    			}
    		}
    	}
    	
    	return suggestedMove;
    }
    
    public int[] getBoard() {
    	return board;
    }
    
    public int[] getDefaultBoard() {
    	return defaultBoard;
    }
    
    public int getBoardValue(int value) {
    	return board[value];
    }
    
    public Player getPlayer() {
    	return player;
    }
    
    public int getScore() {
    	return score.getScore();
    }
    
    public Ghost getGhost1() {return ghost1;}
    public Ghost getGhost2() {return ghost2;}
    public Ghost getGhost3() {return ghost3;}
    
    
    public boolean gameEndCheck() {
    	boolean gameContinue = true;
    	
    	if (getScore() == 347) gameContinue = false; // If the score equals the maximum then the game is won
    	
    	if (ghost1.getGhostLocation() == player.getCharLocation()) {
    		if (ghost1.getGhostActive() == true && player.isPlayerPowered() == false) {
    			gameContinue = false;
    		// Determines when the ghost and player share a space and ghost is alive to decide whether the game should continue or end.
    		} else if (ghost1.getGhostActive() == true && player.isPlayerPowered() == true) {
    			int currentSpace = ghost1.getGhostLocation();
    			board[currentSpace] = ghost1.getCurrentLocationValue();
    			board[ghost1.getStartingLocation()] = GHOST1;
    			ghost1.reset();
    			ghost1.setGhostDead();    			
    		}
    		// Determines if the ghost is active and player is powered up
		} else if (ghost2.getGhostLocation() == player.getCharLocation()) {
    		if (ghost2.getGhostActive() == true && player.isPlayerPowered() == false) {
    			gameContinue = false;
    		// Determines when the ghost and player share a space and ghost is alive to decide whether the game should continue or end.
    		} else if (ghost2.getGhostActive() == true && player.isPlayerPowered() == true) {
    			int currentSpace = ghost2.getGhostLocation();
    			board[currentSpace] = ghost2.getCurrentLocationValue();
    			board[ghost2.getStartingLocation()] = GHOST2;
    			ghost2.reset();
    			ghost2.setGhostDead();
    		}
    		// Determines if the ghost is active and player is powered up
		} else if (ghost3.getGhostLocation() == player.getCharLocation()) {
    		if (ghost3.getGhostActive() == true && player.isPlayerPowered() == false) {
    			gameContinue = false;
    		// Determines when the ghost and player share a space and ghost is alive to decide whether the game should continue or end.
    		} else if (ghost3.getGhostActive() == true && player.isPlayerPowered() == true) {
    			int currentSpace = ghost3.getGhostLocation();
    			board[currentSpace] = ghost3.getCurrentLocationValue();
    			board[ghost3.getStartingLocation()] = GHOST3;
    			ghost3.reset();
    			ghost3.setGhostDead();
    		}
    		// Determines if the ghost is active and player is powered up
		}
    	return gameContinue;
    }
    
    public void clearScreen() {
    	// Clear the screen
        System.out.print(CLEAR_SCREEN);
    }
    
    
    public void gameRestart() {
    	board = defaultBoard;
    	score.reset();
    	player.reset();
    	player.setCharLocation(542);
    	ghost1.reset();
    	ghost1.setCurrentLocationValue(9);
    	ghost1.setPreviousLocation(GHOST2_HOME);
    	ghost2.reset();
    	ghost2.setCurrentLocationValue(9);
    	ghost2.setPreviousLocation(GHOST3_HOME);
    	ghost3.reset();
    	ghost3.setCurrentLocationValue(9);
    	ghost3.setPreviousLocation(GHOST2_HOME);
    }
    
}
