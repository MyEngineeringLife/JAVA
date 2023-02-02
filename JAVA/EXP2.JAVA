/*Given an integer, n, perform the following conditional actions:
•If n is odd, print Weird
•If n is even and in the inclusive range of 2 to 5, print Not Weird
•If n is even and in the inclusive rangeof 6 to 20, print Weird
•If n is even and greater than 20, print Not Weird
*/
import java.util.*;
class controlStatementJournal1 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter a number : ");
int n = sc.nextInt();
if(n%2 == 1)
System.out.print("\n Weird");
else if(n%2 == 0 && n >= 2 && n <= 5){
System.out.print("\n Not weird");
}
else if(n%2 == 0 && n >= 6 && n <= 20){
System.out.print("\n Weird");
}
else if(n%2 == 0 && n > 20){
System.out.print("\n Not weird");
}
}
}


/*Write a Java program that reads a positive integer from command line and count the
number of digits the number (less than ten billion) has.
*/
import java.util.*;
class ControlStatementJournal2 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter a number : ");
int n = sc.nextInt();
int c = 0;
while(n != 0){
n = n / 10;
++c;
}
System.out.print("\n The number of digits are : "+c);
}
}

/*Write a menu driven program using switch case to perform mathematical
operations.(Add/Sub/Multiply/Division/2n/ab)
CODE :
*/
import java.util.*;
class ControlStatementJournal3 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("\n Press 1 to perform addition");
System.out.print("\n Press 2 to perform subtraction");
System.out.print("\n Press 3 to perform division");
System.out.print("\n Press 4 to perform multiplication");
System.out.print("\n Press 5 for 2^n");
System.out.print("\n Press 6 for a^b");
System.out.print("\n\n\n Eenter your choice : ");
int choice = sc.nextInt();
int a,b;
switch(choice)
{
case 1 :
System.out.print("\n Enter number 1 : ");
a = sc.nextInt();
System.out.print("\n Enter number 2 : ");
b = sc.nextInt();
System.out.print("\n\n The sum is : "+(a+b));
break;
case 2 :
System.out.print("\n Enter number 1 : ");
a = sc.nextInt();
System.out.print("\n Enter number 2 : ");
b = sc.nextInt();
System.out.print("\n\n The difference is : "+(a-b));
break;
case 3 :
System.out.print("\n Enter number 1 : ");
double d = sc.nextInt();
System.out.print("\n Enter number 2 : ");
b = sc.nextInt();
System.out.print("\n\n The quotient is : "+(d/b));
break;
case 4 :
System.out.print("\n Enter number 1 : ");
a = sc.nextInt();
System.out.print("\n Enter number 2 : ");
b = sc.nextInt();
System.out.print("\n\n The sum is : "+(a*b));
break;
case 5 :

System.out.print("\n Enter number n : ");
a = sc.nextInt();
System.out.print("\n\n 2^n : "+Math.pow(2,a));
break;
case 6 :
System.out.print("\n Enter number 1 : ");
a = sc.nextInt();
System.out.print("\n Enter number 2 : ");
b = sc.nextInt();
System.out.print("\n\n a^b is : "+ Math.pow(a,b));
break;
default :
System.out.print("\n Wrong input !!!");
}
}
}


/*We use the integers a, b, and n to create the following series:(a+2^0*b), (a+2^0*b+2^1*b),
(a+2^0*b+2^1*b+...... +2^n-1*b)corresponding to the given a,b and n values as a single line ofn
space-separated integers.Eg: i/p:0 2 105 3 5O/P2 6 14 30 62 126 254 510 1022 20468 14 26 50
98
*/
import java.util.*;
class controlStatementJournal4 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter a : ");
int a = sc.nextInt();
System.out.print("\n Enter b : ");
int b = sc.nextInt();
System.out.print("\n Enter n : ");
int n = sc.nextInt();
int sum = a;
for(int i = 0; i < n ; ++i){
sum += (int)(Math.pow(2,i)*b);
System.out.print(sum + " ");
}
}
}


/*WAP to display the following patterns:
1
21
123
4321
12345
654321
1234567 */

class javaJournalPattern1{
    public static void main(String[] args){
    for(int i = 1 ; i <= 7 ; ++i){
    if(i%2 == 1){
    for(int j = 1 ; j <= i ; ++j){
    System.out.print(j+" ");
    }
    }
    else if(i%2 == 0){
    for(int j = i ; j >= 1 ; --j){
    System.out.print(j+" ");
    }
    }
    System.out.println();
    }
    }
    }


/*PROBLEM STATEMENT :
A
C B
F E D
J I H G */

class javaJournalPattern2 {
    public static void main(String[] args){
    char ch = 'A';
    for(int i = 1 ; i <= 4 ; ++i){
    for(int k = 4 ; k >= i ; --k){
    System.out.print(" ");
    }
    ch+=i;
    for(int j = i ; j >= 1 ; --j){
    System.out.print(--ch);
    }
    ch+=i;
    System.out.println();
    }
    }
    }