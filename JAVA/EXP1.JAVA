/*1.WAP to display hello Message on screen.
2.Given an input integer, you must determine which primitive data types 
are capable of properly storing that input. If there is more than one 
appropriate data type, print each one on its own line and order them by 
size
*/

public class first
{
public static void main(String args[]) {
System.out.println("HELLO WORLD");
}
}
2.
import java.util.*;
public class exp1 {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter num : ");
double n=sc.nextDouble();
if ((n>=-1*Math.pow(2,7)) && (n<Math.pow(2,7)))
{
System.out.println("\nByte ");
}
if((n>=-1*Math.pow(2,15)) && n<(Math.pow(2,15)))
{
System.out.println("\tShort ");
}
if((n>=-1*Math.pow(2,31)) && (n<Math.pow(2,31)))
{
System.out.println("\tInteger ");
}
if((n>=-1*Math.pow(2,63)) && (n<Math.pow(2,63)))
{
System.out.println("\tLong ");
}
else
{
System.out.println("\n Error input ");
} 
}
}
