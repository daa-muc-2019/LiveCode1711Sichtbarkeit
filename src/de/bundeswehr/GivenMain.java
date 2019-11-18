package de.bundeswehr;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.sheep.Sheep;

public class GivenMain{


 public static void main(String[] args) {

  Sheep sheep = new Sheep(170, 100, Colour.RED);
  	

  sheep.draw();
  
  sheep.sniff();
  
  sheep.wagEar();
  
  sheep.eat();
  
  sheep.sleep();
  
  sheep.wakeUp();
  
  sheep.digest();
  
  sheep.wagTail();
  
  sheep.wink();
 

 }
}











