package de.bundeswehr.sheep;

import de.bundeswehr.graphics.*;;

class Ear {

	private int xPos, yPos;
	private Ellipse ear;
	private Colour colour;

	Ear(int x, int y, Colour initialColour) {
		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;

		this.ear = new Ellipse(50, 20, xPos, yPos, this.colour);
	}

	void draw() {
		this.ear.draw();
	}

	void wagEar() {
		this.ear.erase();
		this.ear.setHorizontalLength(20);
		this.ear.setVerticalLength(50);
		this.ear.move(-5, -40);
		this.ear.draw();
		HelperClass.wait(1000);
		this.ear.erase();
		this.ear.setHorizontalLength(50);
		this.ear.setVerticalLength(20);
		this.ear.move(5, 40);
		this.ear.draw();
	}

	void setColour(Colour initialColour) {
		this.colour = initialColour;

		ear.setColour(initialColour);
	}

	void move(int xDelta, int yDelta) {
		ear.move(xDelta, yDelta);
	}

	void erase() {
		this.ear.erase();
	}
}
