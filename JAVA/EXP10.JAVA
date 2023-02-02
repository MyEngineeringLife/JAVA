import java.util.*;
abstract class Book{
String title;
abstract void setTitle(String s);
String getTitle(){
return title;
} 
}
class Demo extends Book{
void setTitle(String str){
title = str;
}
}
class Abstraction extends Demo{
public static void main(String args[]){
Demo d=new Demo();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the title:");
String s=sc.nextLine();
d.setTitle(s);
System.out.println("The title of the book is: "+ d.getTitle());
}
}
