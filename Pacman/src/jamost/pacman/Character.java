package jamost.pacman;

import java.awt.Point;

/* Character is the super class which both pacman and ghost extend
 * A Point field stores the location of the character in the maze.
 * Getter and setter methods are provided for the point.
 * 
 * @author Mohamed Elzayat, Jason Brown
 * @ version 1.0 February 16, 2009.
 */
abstract class Character {
	private Point p;
	protected int lastMoveDirection;

	// Constructor
	public Character(Point p) {
		this.p = p;
	}

	// Return the characters position as a point
	public Point getPosition() {
		return p;
	}

	/*
	 * Sets the characters location by accepting a point as a parameter and
	 * returns a boolean depending on success or failure.
	 */
	public Boolean setPosition(Point p) {
		this.p.setLocation(p);
		return true;
	}

	public int getLastDirection() {
		return lastMoveDirection;
	}
	
	public void setLastDirection(int direction) {
		lastMoveDirection = direction;
	}

	// Abstract methods which are called to change the characters
	// location
	//abstract void move(int direction);

}

