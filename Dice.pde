
void setup()
{
	size(400, 450);
	background(255);
	noLoop();


}
void draw()
{
  Die dice = new Die(10,10);
  dice.show();
  dice.roll();
}
void mousePressed()
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
	
	  
	}
	void roll()
	{

	}
	void show()
    {
    int sum = 0;	
    
    for(int x = 10; x < 400; x+= 50)
     {
     for(int y = 10; y < 400; y+= 50)
      {
   	  fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
      rect(x, y, 30, 30);
        numDot = (int)(Math.random()*6+1);

       rect(200,450,100,100);
       sum = sum + numDot;
       
       

       textSize(20);
        text("The sum is" + sum , 200,450);


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
