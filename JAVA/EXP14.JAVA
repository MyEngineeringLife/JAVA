/*PROBLEM STATEMENTS:
a. WA generic program that determines the volume and surface of a sphere with radius specified in 
different types
b. WA generic program that compares the objects of different classes for equality
c. Write a simple generic version of method isEqualTo that compares its two arguments with the equals 
method and returns true if they’re equal and false otherwise. Use this generic method in a program 
that calls isEqualTo with a variety of built-in types, such as Object or Integer. What result do you get 
when you attempt to run this program?
d. Write a generic method selectionSort based on the sort program. Write a test program that inputs, 
sorts and outputs an Integer array and a Float array. [Hint: Use > in the type-parameter section for 
method selectionSort, so that you can use method compareTo to compare the objects of the type that 
T represents.]
TECHNOLOGY STACK USED: Java Development Kit, Notepad, Windows Terminal
*/
class sphere<T extends Number>
{
 Number volume(T radius)
 {
 return (radius.doubleValue()*radius.doubleValue()*radius.doubleValue()*(4/3)*3.1415);
 }
 Number area(T radius)
 {
 return (radius.doubleValue()*radius.doubleValue()*4*3.14);
 }
}
class Exp14a
{
 public static void main(String[] args) 
 {
 sphere<Integer> s = new sphere<Integer>();
 int i=3;
 System.out.println("Volume="+s.volume(i));
 System.out.println("Surface area="+s.area(i));
 
 sphere<Float> s1 = new sphere<Float>();
 float j=3;
 System.out.println("Volume="+s1.volume(j));
 System.out.println("Surface area="+s1.area(j));
 sphere<Integer> s2 = new sphere<Integer>();
 Integer k=3;
 System.out.println("Volume="+s2.volume(k));
 System.out.println("Surface area="+s2.area(k));
 }
}



class Xyz{}
class Abc{}
class compare<T, U>
{
 void type(T obj1, U obj2)
{
System.out.println(obj1.equals(obj2));
}
}
class Exp14b
{
 public static void main(String[] args) 
 {
Xyz x = new Xyz();
Abc a = new Abc();
 compare<Xyz, Abc> s = new compare<Xyz, Abc>();
compare<Abc, Abc> t = new compare<Abc, Abc>();
 s.type(x, a);
t.type(a, a);
 }
}
Output (Screenshots):
Code:
class Exp14c
{
public static <T extends Comparable<T>> void isEqualTo(T o1, T o2)
{
int r=o1.compareTo(o2);
if(r == 0)
System.out.println(o1+" = "+o2);
else if(r > 0)
System.out.println(o1+" > "+o2);
else
System.out.println(o1+" < "+o2);
}
 public static void main(String[] args) 
 {
 isEqualTo(14, 14);
isEqualTo(14, 29);
isEqualTo(14, 2);
isEqualTo("bac", "abc");
 }
}
Output (Screenshots):
Code:
class Exp14d
{
public static <T extends Comparable<T>> void selectionSort(T arr[])
{
 for(int i = 0; i < arr.length;i++)
 {
 T min = arr[i];
 int minindex =i;
 for(int j = i+1; j < arr.length;j++)
 {
 if(min.compareTo(arr[j]) > 0)
 {
 min = arr[j];
 minindex = j;
 }
 }
 if(minindex != i)
 {
 T temp = arr[minindex];
 arr[minindex] = arr[i];
 arr[i] = temp;
 }
 }
}
public static void main(String[] args)
{
Integer nums[] = {8,3,1,9,4};
 Double dnums[] = {1.2,63.2,6.1,9.0};
 selectionSort(nums);
 selectionSort(dnums);
 for(int i = 0; i < nums.length;i++)
 System.out.print(" "+nums[i]);
 System.out.println();
 for(int i = 0; i < dnums.length;i++)
 System.out.print(" "+dnums[i]);
}
}
