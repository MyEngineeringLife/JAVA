// PROBLEM STATEMENT :
// We define super digit of an integerusing the following rules:Given an integer, we need to find 
// the super digitof the integer using recursion.·If x has only digit, then its super digit is 
// x.·Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
// For example, the super digit of 9875 will be calculated as:
// super_digit(9875)9+8+7+5 = 29
// super_digit(29)2 + 9 = 11
// super_digit(11)1 + 1 = 2
// super_digit(2)= 2

import java .util.*;
class sum
{
//int n,s,dig;
int add(int n)
{
int s=0,dig=0,m=n;
while(n!=0)
{
dig=n%10;
n = n/10;
s=s+dig;
}
n=s;
if(n/10 == 0){
return n; 
}
else
{
n = add(n);
}
return n;
}
}

class expt6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter num: ");
int n;
n=sc.nextInt();
sum s1 = new sum();
int ab= s1.add(n);
System.out.println("Supernum= "+ ab);
}
}

// PROBLEM STATEMENT :
// Each year, sleepy Hollow Elementary school holds a “Principal for a day” lottery. A student 
// can participate by entering his/her name and ID into a pool of candidates. The winner is 
// selected randomly from all entries. Each student is allowed one entry. Implement a 
// student class that encapsulates a student. Implement StudentLottery class with methods 
// addStudents() and pickwinner() and main().Hint: Use Random class to pick winner.
// CODE :
import java.util.*;
class Student
{
int id;
String name;
Student(String name , int id)
{
this.name = name;
this.id = id;
}
}
class StudentLottery
{
void addStudent(int n)
{
Scanner sc = new Scanner(System.in);
Student[] s = new Student[n];
for(int i = 0 ; i < n ; ++i)
{
System.out.print("\n Enter name of student : ");
String name = sc.next();
System.out.print("\n Enter student ID : ");
int id = sc.nextInt();
s[i] = new Student(name,id);
}
int winner = pickWinner(n,s);
System.out.print("\n The winner is "+s[winner].name + " id " + s[winner].id);
}
int pickWinner(int n,Student Stud[])
{
Random r=new Random();
int random = r.nextInt(n);
return random;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter number of students : ");
int n = sc.nextInt();
StudentLottery s = new StudentLottery();
s.addStudent(n);
}
}

// WAP to display area of square and rectangle using the concept of overloaded functions


import java .util.*;
class Shape{
double area(double a){
return a*a;
}
double area(double l,double b){
return l*b;
} 
}
class area{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for square.");
System.out.println("Enter 2 for rectangle.");
System.out.println("Enter your choice.");
int n=sc.nextInt();
switch(n){
case 1: System.out.println("Enter a side: ");
double a=sc.nextDouble();
Shape s=new Shape();
double area1 = s.area(a);
System.out.println("THE AREA IS: "+area1);
break;
case 2: System.out.println("Enter a length: ");
double l=sc.nextDouble();
System.out.println("Enter a breadth: ");
double b=sc.nextDouble();
Shape r=new Shape();
double area2 = r.area(l,b);
System.out.println("THE AREA IS: "+area2);
break;
default:
System.out.println("Wrong input. ");
break;
}
}
}


//WAP to display area of square and rectangle using the concept of constructor overloading.
 

import java .util.*;
class Shape{
double l,b;
Shape( double l,double b)
{
this.l=l;
this.b=b;
}
Shape(double a)
{
this.l=a;
this.b=a;
} 
double area(){
return l*b;
} 
}
class Area2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for square.");
System.out.println("Enter 2 for rectangle.");
System.out.println("Enter your choice.");
int n=sc.nextInt();
switch(n){
case 1: System.out.println("Enter a side: ");
double a=sc.nextDouble();
Shape s=new Shape(a);
double area1 = s.area();
System.out.println("THE AREA IS: "+area1);
break;
case 2: System.out.println("Enter a length: ");
double l=sc.nextDouble();
System.out.println("Enter a breadth: ");
double b=sc.nextDouble();
Shape r=new Shape(l,b);
double area2 = r.area();
System.out.println("THE AREA IS: "+area2);
break;
default:
System.out.println("Wrong input. ");
break;
}
}
}
