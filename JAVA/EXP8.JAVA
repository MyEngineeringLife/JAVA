//INHERITANCE

import java.util.*;
class Staff
{
String code;
String name;
void read()
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter code : ");
code = sc.next();
System.out.print("\n Enter name : ");
name = sc.next();
}
void display()
{
System.out.print("\n Name : "+name);
System.out.print("\n Code : "+code);
} 
}
class Teacher extends Staff
{
String sub;
int exp;
void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.print("\n Enter subject to teach : ");
sub = sc.next();
System.out.print("\n Enter years of experience : ");
exp = sc.nextInt();
}
void display()
{
super.display();
System.out.print("\n Subject : "+sub);
System.out.print("\n Experience : "+exp);
}
}
class Typist extends Staff
{
int speed;
int exp;
void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.print("\n Enter speed : ");
speed = sc.nextInt();
System.out.print("\n Enter years of experience : ");
exp = sc.nextInt();
}
void display()
{
super.display();
System.out.print("\n Speed : "+speed+" words/min");
System.out.print("\n Experience : "+exp);
}
}
class Regular extends Typist
{
int sal;
void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.print("\n Enter salary : ");
sal = sc.nextInt();
}
void display()
{
super.display();
System.out.print("\n Salary : "+sal);
}
}
class Casual extends Typist
{
int daily_wages;
void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.print("\n Enter daily wage : ");
daily_wages = sc.nextInt(); 
}
void display()
{
super.display();
System.out.print("\n Daily wage : "+daily_wages);
}
}
class Officer extends Staff
{
String dept;
int grade;
void read()
{
Scanner sc = new Scanner(System.in);
super.read();
System.out.print("\n Enter department : ");
dept = sc.next();
System.out.print("\n Enter grade : ");
grade = sc.nextInt();
}
void display()
{
super.display();
System.out.print("\n Department : "+dept);
System.out.print("\n Grade : "+grade);
}
}
class StaffDemo
{
public static void main(String[] args)
{
Teacher t = new Teacher();
Regular r = new Regular();
Casual c = new Casual();
Officer o = new Officer();
t.read();t.display();
r.read();r.display();
c.read();c.display();
o.read();o.display();
}
}
