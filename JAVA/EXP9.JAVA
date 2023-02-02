

import java .util.*;
interface sport{
void setscore(int s);
}
class Student{
int rollno;
void getdata(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the roll number:");
rollno=sc.nextInt();
}
}
class Test extends Student{
int m1,m2;
void getdata(){
super.getdata();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks1:");
m1=sc.nextInt();
System.out.println("Enter the marks2:");
m2=sc.nextInt();
}
}
class Result extends Test implements sport{
int score;
int total;
public void setscore(int s)
{
score=s;
}
void total(){
total=m1+m2+score;
System.out.println("The rollno is:"+rollno);
System.out.println("The total is:"+total);
}
}
class Interface{
public static void main(String args[])
{
int s;
Scanner sc=new Scanner(System.in);
Result r=new Result();
r.getdata();
System.out.println("Enter the score:");
s=sc.nextInt();
r.setscore(s);
r.total();
}
}