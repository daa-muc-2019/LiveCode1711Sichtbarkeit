package de.bundeswehr.sheep;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.graphics.Ellipse;

class Leg {

	private int xPos, yPos;
	private Ellipse leg;

	Leg(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		this.leg = new Ellipse(20, 80, xPos, yPos, Colour.BLACK);
	}

	void draw() {
		this.leg.draw();
	}

	void erase() {
		this.leg.erase();
	}
}
