package RetroPacManGame;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testLaunch() {
		Game g = new Game();
		assertEquals(g.getScore(), new Score().getScore());
		assertEquals(g.getPlayer().getCharLocation(), new Player().getCharLocation());
		assertEquals(g.getGhost1().getGhostLocation(), new Ghost().getGhostLocation());
		assertEquals(g.getGhost2().getGhostLocation(), new Ghost().getGhostLocation());
		assertEquals(g.getGhost3().getGhostLocation(), new Ghost().getGhostLocation());
	}
	
	@Test
	void testCharMoveUp() {
		Game g = new Game();
		g.printBoard();
		g.charMove('w');
		g.printBoard();
		assertTrue(g.getScore() == 1);
		int spot = g.getPlayer().getCharLocation();
		assertTrue(g.getBoardValue(spot) == 2); 
		assertTrue(g.getBoardValue(spot + 31) == -1);
	}
	
	@Test
	void testCharMoveLeft() {
		Game g = new Game();
		g.printBoard();
		g.charMove('a');
		g.printBoard();
		assertTrue(g.getScore() == 1);
		int spot = g.getPlayer().getCharLocation();
		assertTrue(g.getBoardValue(spot) == 2); 
		assertTrue(g.getBoardValue(spot + 1) == -1);
	}
	
	@Test
	void testCharMoveRight() {
		Game g = new Game();
		g.printBoard();
		g.charMove('d');
		g.printBoard();
		assertTrue(g.getScore() == 1);
		int spot = g.getPlayer().getCharLocation();
		assertTrue(g.getBoardValue(spot) == 2); 
		assertTrue(g.getBoardValue(spot - 1) == -1);
	}
	
	@Test
	void testCharMoveDown() {
		Game g = new Game();
		g.printBoard();
		g.charMove('s');
		g.printBoard();
		assertTrue(g.getScore() == 0);
		int spot = g.getPlayer().getCharLocation();
		assertTrue(g.getBoardValue(spot) == 2); 
		assertTrue(g.getBoardValue(spot - 31) == 1);
		assertTrue(g.getBoardValue(spot - 1) == 1);
		assertTrue(g.getBoardValue(spot + 1) == 1);
	}
	
	
	@Test
	void testBoardMatch() {
		Game g = new Game();
		equals(g.getDefaultBoard() == g.getBoard());
	}
	
	@Test 
	void scoreAfterMove() {
		Game g = new Game();
		g.gameSetUp();
		g.printBoard();
		g.charMove('a');
		assertTrue(g.getScore() == 1);
	}
	

}
