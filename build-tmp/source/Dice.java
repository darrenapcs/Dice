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
	 	 for(int x = 10; x < 400; x+= 50)
 {
   for(int y = 10; y < 400; y+= 50)
   {
   	fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
     rect(x, y, 30, 30);
   }
 }
   
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY;
	int numDice;
	Die(int x, int y) //constructor
	{
	  myX = x;
	  myY = y;
	  numDice = (int)(Math.random()*6+1);
	  
	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{


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
