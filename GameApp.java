package RetroPacManGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class GameApp extends Frame implements KeyListener{
	
	private static Game game = new Game();
	private TextField textField;
	private Label displayLabel;
	
	public GameApp() {

		// Set frame properties
	    setTitle("Typed Text Display");
	    setSize(400, 200);
	    setLayout(new FlowLayout());
	    
	    // Create and add a Label to display typed text
	    displayLabel = new Label("Type movement controls in here\n");
	    add(displayLabel);
	    
	    // Creates the text field to type keyboard inputs into
	 	textField = new TextField(20);
	 	textField.addKeyListener(this);
	 	add(textField);

	    // Ensure the frame can receive key events
	    setFocusable(true);
	    setFocusTraversalKeysEnabled(false);
	    
	    // Make the frame visible
	    setVisible(true);
	}
	
	 // Implement the keyPressed method
	 @Override
	 public void keyPressed(KeyEvent e) {
		 char keyCode = e.getKeyChar(); // Changes the input into a character
		 game.charMove(keyCode); // Runs the character move command with the captured character
	 }

	 // Implement the keyReleased method
	 @Override
	 public void keyReleased(KeyEvent e) {
	 }

	 // Implement the keyTyped method
	 @Override
	 public void keyTyped(KeyEvent e) {
	 }
	 
	 public static void main(String[] args) {
		boolean repeatGame = true;
		new GameApp();
		while (repeatGame) {
			game.gameSetUp();
			game.clearScreen();
			game.printBoard();
			int moveCounter = 0;

			while (game.gameEndCheck()) {
				try {
					moveCounter += 1;
		             Thread.sleep(750); // Delay new board post
		             game.clearScreen(); // Clears the screen
		             game.printBoard(); // Outputs the board after the delay
		             if (moveCounter % 2 == 0) {
		            	game.ghostMove(1); // Moves Ghost 1
			            game.ghostMove(2); // Moves Ghost 2
			            game.ghostMove(3); // Moves Ghost 3

		             }
		         } catch (InterruptedException e) {
		             e.printStackTrace(); // Catches an interruption error to prevent a crash
		         }
			}
			if (game.getScore() == 347) {
				System.out.println("You win. \n Would you like to play again? Yes or No?");
			} else {
				System.out.println("Game Over. \n Would you like to play again? Yes or No?");
			}
			boolean repeatInput = true;
			while (repeatInput) {
				Scanner scan = new Scanner(System.in);
				String response = scan.nextLine();
				if (response.equals("yes") || response.equals("Yes")) {
					repeatInput = false;
					game.gameRestart();
				} else if (response.equals("no") || response.equals("No")) {
					repeatGame = false;
					repeatInput = false;
				} else {
					System.out.println("Input not correct. Try Again. ");
				}
			}
		}
		 
		 
	}
	
}
