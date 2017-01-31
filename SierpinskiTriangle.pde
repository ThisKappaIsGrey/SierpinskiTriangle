int len = 500;
int siz = 500;
int count = 0;
public void setup()
{
	size(500, 500);
  background(0);
  sierpinski(0, 500, len);
}
public void draw()
{


}
public void mousePressed(){
  count++;
  if(count < 7){
  siz /= 2;
  background(0);
  sierpinski(0, 500, len);
  }else{
    count = 0;
    siz = 500;
    sierpinski(0, 500, len);
  }
}
public void sierpinski(int x, int y, int len)
{
if(len <= siz){
	triangle(x, y, x+len/2, y-len, x+len, y);
}else{
  fill((float)(Math.random() * 255), (float)(Math.random() * 255), (float)(Math.random() * 255));
	sierpinski(x, y, len/2);
	sierpinski(x+len/2, y, len/2);
	sierpinski(x+len/4, y - len/2, len/2);
}
}
