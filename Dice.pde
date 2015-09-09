void setup()
{
	size(400, 400);
	background(255);
	noLoop();


}
void draw()
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
void mousePressed()
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
	void roll()
	{
		//your code here
	}
	void show()
	{


	}
}
