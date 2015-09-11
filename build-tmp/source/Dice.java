import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {


public void setup()
{
	size(400, 400);
	background(255);
	noLoop();


}
public void draw()
{
  Die dice = new Die(10,10);
  dice.show();
  dice.roll();
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY;
	int numDot;
	Die(int x, int y) //constructor
	{
	  myX = x;
	  myY = y;
	  numDot = (int)(Math.random()*6+1);
	  
	}
	public void roll()
	{

	}
	public void show()
    {
    for(int x = 10; x < 400; x+= 50)
     {
     for(int y = 10; y < 400; y+= 50)
      {
   	  fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
      rect(x, y, 30, 30);
      if(numDot == 1)
      {
      fill(0);
      ellipse(x+15, y+15, 5, 5);
      }
      if(numDot == 2)
      {
      fill(0);
      ellipse(x+25, y+5, 5, 5);
      ellipse(x+5, y+25, 5, 5);
      }
      if(numDot == 3)
      {
      fill(0);
      ellipse(x+15, y+15, 5, 5);
      ellipse(x+5, y+25, 5, 5);
      ellipse(x+25, y+5, 5, 5);
      }
      if(numDot == 4)
      {
      fill(0);
      ellipse(x+5, y+25, 5, 5);
      ellipse(x+25, y+25, 5, 5);
      ellipse(x+5, y+5, 5, 5);
      ellipse(x+25, y+5, 5, 5);
      }
      if(numDot == 5)
      {
      fill(0);
      ellipse(x+25, y+5, 5, 5);
      ellipse(x+25, y+25, 5, 5);
      ellipse(x+5, y+25, 5, 5);
      ellipse(x+5, y+5, 5, 5);
      ellipse(x+15, y+15, 5, 5);
      }
      if(numDot == 6)
      {
      fill(0);
      ellipse(x+5, y+25, 5, 5);
      ellipse(x+5, y+5, 5, 5);
      ellipse(x+25, y+25, 5, 5);
      ellipse(x+25, y+5, 5, 5);
      ellipse(x+5, y+15, 5, 5);
      ellipse(x+25, y+15, 5, 5);
      }
      }
     }
	  
      
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
