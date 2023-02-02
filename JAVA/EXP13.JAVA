// Q1 WAP that uses vector class to add 5 names initially. Display a menu: 
// Add new name 
// Delete name 
// Display name 
// Based on the choice entered by the user take appropriate action 
// Q2 WAP to read 5 names of students name from command line and store them in Vector. Sort the list in 
// alphabetical order and display using enumeration interface. 
// Academic Year 2022-23 SAP ID: 60003210039 
// a. WAP that accepts a shopping list of items and performs the following operations: Add an item at a 
// specified location, delete an item in the list, and print the contents of the list. 
// b. WAJP to find the max and min value from a linked list 
// c. WAJP to check if a linked list is a palindrome or not 
// TECHNOLOGY STACK USED: Java Development Kit, Windows Terminal, Notepad 

import java.util.*; 
class Exp13ea 
{ 
 public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
Vector<String>v=new Vector<String>(); 
int ch=0; while(ch!=4) 
 { 
 System.out.println("1. Add new name\n2. Delete name\n3. Display name\n4. Exit"); 
ch = sc.nextInt(); switch(ch) 
 { 
case 1: 
 System.out.println("Enter new name"); 
v.add(sc.next()); break; case 
3: 
 Iterator<String>itr=v.iterator(); 
while(itr.hasNext()) 
System.out.println(itr.next()); break; 
case 2: 
 System.out.println("Enter name to delete"); 
v.remove(sc.next()); break; case 
4: break; default: 
 System.out.println("Invalid input"); 
break; 
 } 
 } 
 } 
} 



import java.util.*; class 
Exp13eb 
{ 
 public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
Vector<String>v=new Vector<String>(); 
int ch=0; for(int i=0;i<5;i++) 
 { 
 System.out.println("Enter new name"); 
v.add(sc.next()); 
 } 
 Collections.sort(v); 
Enumeration e; e = 
v.elements(); 
 while (e.hasMoreElements()) { 
 System.out.println(e.nextElement()); 
 } 
 } 
} 
 
import java.util.*; class 
Exp13a 
{ 
 public static void main(String args[]) 
 {
    Scanner sc = new Scanner(System.in); 
List<String>v=new ArrayList<String>(); int 
ch=0; 
 while(ch!=4) 
 { 
 System.out.println("1. Add new item\n2. Delete item\n3. Display items\n4. Exit"); 
ch = sc.nextInt(); switch(ch) 
 { 
case 1: 
 System.out.println("Enter index and item"); 
v.add(sc.nextInt(), sc.next()); break; 
case 3: 
 Iterator<String>itr=v.iterator(); 
while(itr.hasNext()) 
 System.out.println(itr.next()); 
break; case 2: 
 System.out.println("Enter name to delete"); 
v.remove(sc.next()); break; case 
4: break; default: 
 System.out.println("Invalid input"); 
break; 
 } 
 } 
 } 
} 



import java.util.*; 
class Exp13b { 
 public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
 LinkedList<Integer> v=new LinkedList<Integer>(); 
int ch=0; while(ch!=2) 
 { 
 System.out.println("1. Add new number\n2. Stop"); 
ch = sc.nextInt(); switch(ch) 
 { 
case 1: 
 System.out.println("Enter the number"); 
v.add(sc.nextInt()); break; 
case 2: break; default: 
 System.out.println("Invalid input"); 
break; 
 } 
 } 
 int min=v.getFirst(),max=v.getFirst(); 
Iterator<Integer>itr=v.iterator(); 
while(itr.hasNext()) 
 { 
 int a=itr.next(); 
if(a>max) 
max=a; 
if(a<min) 
min=a; 
 } 
 System.out.println("Max is "+max+"\nMin is "+min); 
 } 
} 
Output (Screenshots): 
Code: 
import java.util.*; class 
Exp13c 
{ 
 public static void main(String args[]) 
 { 
 int p=1, ch=0; 
 Scanner sc = new Scanner(System.in); 
 LinkedList<String> v=new LinkedList<String>(); 
 while(ch!=2) 
 { 
 System.out.println("1. Add new string\n2. Stop"); 
ch = sc.nextInt(); switch(ch) 
 { 
case 1: 
 System.out.println("Enter the string"); 
v.add(sc.next()); break; case 
2: break; default: 
 System.out.println("Invalid input"); 
break; 
 } 
 } 
 Iterator<String> itr=v.iterator(); 
System.out.print("List is "); 
while(itr.hasNext()) 
 { 
 System.out.print(itr.next()+ " "); 
 } 
 while(itr.hasNext()) 
 { 
 String f=v.removeFirst(), l=v.removeLast(); 
if(f.compareTo(l)!=0) 
 { 
p=0; 
break; 
 } 
} 
if(p==0) 
 System.out.println("\nIt is not palindrome"); 
else 
 System.out.println("\nIt is palindrome"); 
 } 
} 
