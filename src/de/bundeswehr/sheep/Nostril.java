package de.bundeswehr.sheep;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.graphics.Ellipse;

class Nostril {

	private Ellipse nostril;
	private int xPos, yPos;

	Nostril(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		this.nostril = new Ellipse(10, 10, xPos, yPos, Colour.BLACK);
	}

	void draw() {
		this.nostril.draw();
	}

	void sniff() {
		this.nostril.setHorizontalLength(18);
		this.nostril.setVerticalLength(18);
		this.nostril.move(-4, -4);
		this.nostril.draw();
	}

	void unsniff() {
		this.nostril.erase();
		this.nostril.setHorizontalLength(10);
		this.nostril.setVerticalLength(10);
		this.nostril.move(4, 4);
		this.nostril.draw();
	}

	void move(int xDelta, int yDelta) {
		nostril.move(xDelta, yDelta);
	}

	void erase() {
		this.nostril.erase();
	}
}
