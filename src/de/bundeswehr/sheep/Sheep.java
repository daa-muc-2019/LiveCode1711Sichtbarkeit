package de.bundeswehr.sheep;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.graphics.Ellipse;
import de.bundeswehr.graphics.HelperClass;

public class Sheep {

	private int xPos, yPos;
	private Colour colour;
	private Ellipse body, tail;
	private Head head;
	private Leg rightLegBack, rightLegFront, leftLegBack, leftLegFront;

	public Sheep(int x, int y, Colour initialColour) {
		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;

		this.head = new Head(xPos - 60, yPos - 40, this.colour);
		this.body = new Ellipse(180, 120, xPos, yPos, this.colour);
		this.tail = new Ellipse(20, 50, xPos + 174, yPos + 60, this.colour);
		this.rightLegFront = new Leg(xPos + 5, yPos + 80);
		this.rightLegBack = new Leg(xPos + 125, yPos + 80);
		this.leftLegFront = new Leg(xPos + 30, yPos + 90);
		this.leftLegBack = new Leg(xPos + 150, yPos + 90);
	}

	public void draw() {
		this.head.draw();
		this.rightLegBack.draw();
		this.rightLegFront.draw();
		this.body.draw();
		this.tail.draw();
		this.leftLegFront.draw();
		this.leftLegBack.draw();
	}

	public void sniff() {
		HelperClass.wait(1000);
		this.head.sniff();
	}

	public void sleep() {
		this.head.sleep();
		HelperClass.wait(1000);
	}

	public void wakeUp() {
		head.wakeUp();
		HelperClass.wait(1000);
	}

	public void wink() {
		this.head.wink();
	}

	public void eat() {
		this.erase();
		this.draw();
		HelperClass.wait(1000);
		this.head.lower();
		HelperClass.wait(1000);
		this.body.setVerticalLength(160);
		this.body.draw();
		this.leftLegBack.draw();
		this.leftLegFront.draw();
		this.head.draw();
		HelperClass.wait(1000);
		this.getSick();
		HelperClass.wait(1000);
		this.head.rise();
		HelperClass.wait(1000);
	}

	private void getSick() {
		HelperClass.wait(1000);
		this.head.setColour(Colour.GREEN);
	}

	public void getWell() {
		HelperClass.wait(1000);
		head.setColour(Colour.RED);
	}

	public void digest() {
		HelperClass.wait(1000);
		this.body.setVerticalLength(120);
		this.getWell();
		this.body.draw();
		this.leftLegBack.draw();
		this.leftLegFront.draw();
	}
	
	public void wagEar() {
		HelperClass.wait(1000);
		this.head.wagEear();
	}

	public void wagTail() {
		this.tail.erase();
		this.tail.move(0, -15);
		this.tail.setHorizontalLength(50);
		this.tail.setVerticalLength(20);
		this.tail.draw();
		HelperClass.wait(500);
		this.tail.erase();
		this.tail.move(0, -40);
		this.tail.setHorizontalLength(20);
		this.tail.setVerticalLength(50);
		this.tail.draw();
		HelperClass.wait(500);
		this.tail.erase();
		this.tail.move(0, 55);
		this.tail.draw();
	}

	private void erase() {
		this.body.erase();
		this.tail.erase();
		this.head.erase();
		this.rightLegBack.erase();
		this.rightLegFront.erase();
		this.leftLegBack.erase();
		this.leftLegFront.erase();
	}

}
