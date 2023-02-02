// WOOP to arrange the names of students in descending order of their total marks, 
// input data consists of students details such as names, ID.no, marks of maths, 
// physics, chemistry. (Use array of objects) 

import java.util.*;
class Student
{
String name,id;
int m1,m2,m3;
int total;
Student(){}
void readData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
name=sc.nextLine();
System.out.println("Enter id:");
id=sc.nextLine();
System.out.println("Enter m1:");
m1=sc.nextInt();
System.out.println("Enter m2:");
m2=sc.nextInt();
System.out.println("Enter m3:");
m3=sc.nextInt();
total=m1+m2+m3;
}
void display()
{
System.out.println("\n"+name+"\t"+id+"\t"+total+"\n");
}
} 
class Demo
{
public static void main(String[]args)
{
int i,j;
Student s[]=new Student[3];
s[0]=new Student();
s[1]=new Student();
s[2]=new Student();
for(i=0;i<3;i++)
{
s[i].readData();
for(j=0;j<s.length-i-1;++j)
{
Student temp=new Student();
if(s[j].total<s[j+1].total)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
for(i=0;i<3;i++)
s[i].display();
}
}