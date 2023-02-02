// PROBLEM STATEMENT : Write a Java Program to read input from user in an array 
// using datainputstream and Find out total valid and in-valid integers. (Hint: use exception 
// handling)

import java.util.*;
import java.io.*;
class ExceptionHandling1
{
public static void main(String args[])throws IOException
{
DataInputStream in = new DataInputStream(System.in);
System.out.print("\n Enter size of array :");
int n = Integer.parseInt(in.readLine());
int arr[] = new int[n];
System.out.print("\n \n ENTER ONLY INTEGER ONLY");
int c = 0;
for(int i = 0 ; i < n ; ++i)
{
try{
System.out.print("\n Enter value at position "+(i+1)+": ");
arr[i] = Integer.parseInt(in.readLine());
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Size of array Exceeded");
}
catch(NumberFormatException e){
++c;
}
}
System.out.println(c+" values are not integer type");
}
}

// PROBLEM STATEMENT : Write a Java Program to Create a User Defined Exception 
// class MarksOutOfBoundsException, If Entered marks of any subject is greater than 100 
// or less than 0, and then program should create a user defined Exception of type 
// MarksOutOfBoundsException and must have a provision to handle it.
 
import java.util.*;
class MarksOutOfBoundsException extends Exception
{
MarksOutOfBoundsException(String a)
{
super(a);
}
}
class MyOwnException
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter the student's marks : ");
int marks = sc.nextInt();
try{
if(marks > 100 || marks < 0)
{
throw new MarksOutOfBoundsException("Marks cannot be greater than 100 or 
less than 0");
}
System.out.print("\n The student's marks are : " + marks);
}
catch(MarksOutOfBoundsException e)
{
System.out.print("\n" + e);
}
}
}

// PROBLEM STATEMENT : Write a program to display error when a number is divided by 
// zero

import java.util.*;
class DivisionByZero
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter number 1 : ");
int num1 = sc.nextInt();
System.out.print("\n Enter number 2 : ");
int num2 = sc.nextInt();
try
{
System.out.print("\n The Quotient is : "+(num1/num2));
}
catch(ArithmeticException e)
{
System.out.print("Division by 0 is not possible");
}
}
}

// PROBLEM STATEMENT : User defined exceptions : when the input string is not equal to 
// "India"

import java.util.*;
class InvalidStringException extends Exception
{
InvalidStringException(String a)
{
super(a);
}
}
class MyOwnException2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter a string : ");
String s = sc.next();
s = s.toLowerCase();
try
{
if(!s.equals("india"))
{
throw new InvalidStringException("The entered value is not india");
}
System.out.print("The entered string is india");
}
catch(InvalidStringException e)
{
System.out.print("\n"+e);
}
}
}
