//WAOOP to count the number of objects 

class counter {
static int count=0;
counter(){
count++;
}
int print(){
return count;
}
}
class Democounter{
public static void main(String args[]){
counter c1= new counter();
counter c2= new counter();
counter c3= new counter();
int c = c3.print();
System.out.println(c);
}
}


//7.B

class Rectangle{
static double l,b;
Rectangle(){
l=0;
b=0;
}
Rectangle(double x,double y){
l=x;
b=y;
}
static double area(){
return l*b;
}
}
class Cube{
static double side;
Cube(){
side=0;
}
Cube(double s){
side=s;
}
static double volume(){
return side*side*side;
}
}
class Size {
double size(Object z){
if(z instanceof Rectangle ){
return(Rectangle.area());
}
else if(z instanceof Cube){
return(Cube.volume());
}
else{
return -1;
}
}
public static void main(String args[]){
Size s=new Size();
Rectangle r=new Rectangle(10,20);
Cube c=new Cube(5);
System.out.println(s.size(r));
System.out.println(s.size(c));
System.out.println(s.size(5));
}
}