/*PROBLEM STATEMENT : WAP to check if 2 strings are Meta strings or not. Meta 
strings are the strings which can be made equal by exactly one swap in any of the strings. Equal 
strings are not considered here as Meta strings.
Algorithm (if reqd):
1.Check if both strings are of equal length or not, if not return false.
2.Otherwise, start comparing both strings and count number of unmatched characters and also 
store the index of unmatched characters.
3.If unmatched characters are more than 2 then return false.
4.Otherwise check if on swapping any of these two characters in any string would make the 
string equal or not.5.If yes then return true. Otherwise return false.
*/ 
import java.util.*;
class metastring
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter the first string : ");
String s1 = sc.nextLine();
System.out.print("\n Enter the second string : ");
String s2 = sc.nextLine();
if(isMeta(s1,s2) == true)
{
System.out.print("\n The strings are Meta Strings ");
}
else if(isMeta(s1,s2) == false)
{
System.out.print("\n The strings are NOT Meta Strings ");
}
}
public static boolean isMeta(String s1 , String s2)
{
if(s1.length() != s2.length())
{
return false;
}
else if(s1.length() == s2.length())
{
int c = 0;
for(int i = 0 ; i < s1.length() ; ++i)
{
if(s1.charAt(i) != s2.charAt(i))
{
c++;
}
}
if(c > 2)
{
return false;
}
else
{
c = 0;
int a[] = new int[2];
for(int i = 0 ; i < s1.length() ; ++i)
{
if(s1.charAt(i) != s2.charAt(i))
{
a[c] = i;
c++;
}
}
if(s1.charAt(a[0]) == s2.charAt(a[1]) && s1.charAt(a[1]) == s2.charAt(a[0]))
{
return true;
}
}
}
return false;
}
}
/* 
PROBLEM STATEMENT ; Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He 
wants to reduce the string to its shortest length by doing a series of operations. In each operation 
he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the 
string aab could be shortened to b in one operation.Steve’s task is to delete as many characters as 
possible using this method and print the resulting string. If the final string is empty, print Empty 
String*/
import java.util.*;
class steveStringDeletion
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter the string : ");
String s = sc.nextLine();
int c = 0;
while(c != 0 || s.length() != 0)
{
c = 0;
for(int i = 0 ; i < s.length()-1 ; ++i)
{
if(s.charAt(i) == s.charAt(i+1))
{
s = s.substring(0,i) + s.substring(i+2);
++c;
break;
}
}
if(c == 0 || s.length() == 0)
break;
}
if(c == 0)
System.out.print(s);
else if(s.length() == 0)
System.out.print("\n Empty String");
}
}
