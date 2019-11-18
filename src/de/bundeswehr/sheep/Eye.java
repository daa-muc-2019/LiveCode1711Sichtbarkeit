package de.bundeswehr.sheep;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.graphics.Ellipse;

class Eye {

	private int xPos, yPos;
	private Ellipse iris, pupil, eyeLid;
	private Colour colour;

	Eye(int x, int y, Colour initialColour) {

		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;

		this.iris = new Ellipse(20, 20, xPos, yPos, Colour.BLACK);
		this.pupil = new Ellipse(8, 8, xPos + 6, yPos + 7, Colour.WHITE);
		this.eyeLid = new Ellipse(20, 20, xPos, yPos - 3, this.colour);

	}

	void draw() {
		this.iris.draw();
		this.pupil.draw();
	}

	void closeEyeLid() {
		eyeLid.draw();
	}

	void openEyeLid() {
		eyeLid.erase();
	}

	void setColour(Colour initialColour) {
		this.colour = initialColour;

		eyeLid.erase();
		eyeLid.setColour(initialColour);
	}

	void move(int xDelta, int yDelta) {
		pupil.move(xDelta, yDelta);
		iris.move(xDelta, yDelta);
		eyeLid.move(xDelta, yDelta);
	}

	void erase() {
		this.iris.erase();
		this.pupil.erase();
		this.eyeLid.erase();
	}
}
