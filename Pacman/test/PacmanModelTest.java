package jamost.pacman.test;

/*
 * @autorh: Jason Brown
 */

import java.awt.Point;

import jamost.pacman.Inky;
import jamost.pacman.PacmanModel;
import junit.framework.TestCase;

public class PacmanModelTest extends TestCase {
	PacmanModel pm;
	private static final int UP	= 1;
	private static final int DOWN	= 2;
	private static final int LEFT	= 3;
	private static final int RIGHT	= 4;

	protected void setUp() throws Exception {
		super.setUp();
		pm = new PacmanModel();
	}

	public void testPacmanModel() {
		PacmanModel constructorTest = new PacmanModel();
	}

	public void testGetGhostDirection() {
		fail("Not yet implemented");
	}

	public void testExitGame() {
		fail("Not yet implemented");
	}

	public void testResetGame() {
		fail("Not yet implemented");
	}

	public void testResetCharacterPositions() {
		fail("Not yet implemented");
	}

	public void testMove() {
		fail("Not yet implemented");
	}

	public void testCheckForWinners() {
		assertEquals("Nobody should have won yet",0,pm.checkForWinners());
	}

	public void testGetMaze() {
		fail("Not yet implemented");
	}

	public void testToString() {
		fail("Not yet implemented");
	}

	public void testGetPacmanPosition() {
		assertEquals(new Point(12,13),pm.getPacmanPosition());
		pm.move(DOWN);
		System.out.println(pm.getPacmanPosition().x + " " + pm.getPacmanPosition().y);
		assertEquals(new Point(12,14),pm.getPacmanPosition());
		System.out.println(pm.getPacmanPosition().x + " " + pm.getPacmanPosition().y);
		pm.move(LEFT);
		assertEquals(new Point(12,13),pm.getPacmanPosition());
		
	}

	public void testGetPinky() {
		assertEquals(new Point(12,7),pm.getPinky());
		pm.move(DOWN);
		assertEquals("Pinky should move right",new Point(13,7),pm.getPinky());
	}

	public void testGetInky() {
		assertEquals(new Point(12,7),pm.getInky());
		pm.move(DOWN);
		assertEquals("Inky should move left",new Point(11,7),pm.getInky());
	}

	public void testGetBlinky() {
		assertEquals(new Point(12,7),pm.getBlinky());
		pm.move(DOWN);
		assertEquals("Blinky should follow pacman down",new Point(12,8),pm.getBlinky());
	}

	public void testGetClyde() {
		assertEquals(new Point(12,7),pm.getClyde());
		pm.move(DOWN);
		assertEquals("Clyde should move up",new Point(12,6),pm.getClyde());
	}

	public void testGetScore() {
		assertEquals(0,pm.getScore());
		pm.move(UP);
		assertEquals(10,pm.getScore());
	}

	public void testGetPacmansLastMove() {
		assertEquals(0,pm.getPacmansLastMove());
		pm.move(UP);
		assertEquals(UP, pm.getPacmansLastMove());
		pm.move(LEFT);
		assertEquals(LEFT, pm.getPacmansLastMove());
		pm.move(RIGHT);
		assertEquals(RIGHT, pm.getPacmansLastMove());
		pm.move(DOWN);
		assertEquals(DOWN, pm.getPacmansLastMove());
	}

}
