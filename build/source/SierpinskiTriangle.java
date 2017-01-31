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

public class SierpinskiTriangle extends PApplet {

int len = 500;
int size = 500;
int count = 0;
public void setup()
{
	
  background(0);
  sierpinski(0, 500, len);
}
public void draw()
{


}
public void mousePressed(){
  if(count > 5){
    count = 0;
    len = 500;
    sierpinski(0, 500, len);
  }else{
  count++;
  size /= 2;
  background(0);
  sierpinski(0, 500, len);
  }
}
public void sierpinski(int x, int y, int len)
{
if(len <= size){
	triangle(x, y, x+len/2, y-len, x+len, y);
}else{
  fill((float)(Math.random() * 255), (float)(Math.random() * 255), (float)(Math.random() * 255));
	sierpinski(x, y, len/2);
	sierpinski(x+len/2, y, len/2);
	sierpinski(x+len/4, y - len/2, len/2);
}
}
  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
