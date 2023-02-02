/*PROBLEM STATEMENT : You have been given an array of positive integers A1, 
A2,...,An with length N and you have to print an array of same length (N) where the values in the 
new array are the sum of every number in the array, except the number at that index.i/p 1 2 3 
4For the 0th index, the result will be 2+3+4= 9, similarly for the second, third and fourth index 
the corresponding results will be 8, 7 and 6 respectively.i/p 4 5 6o/p 11 10 9
*/
import java.util.*;
class arraySum
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter number of elements : ");
int n = sc.nextInt();
int sum = 0;
int a[] = new int[n];
for(int i = 0 ; i < n ; ++i)
{
System.out.print("\n Enter element "+(i+1)+" : ");
a[i] = sc.nextInt();
sum += a[i];
}
for(int i = 0 ; i < n ; ++i)
{
System.out.print((sum-a[i]) + " ");
}
}
}


/*PROBLEM STATEMENT : Write a program that queries the user for the no of rows and 
columns representing students and their marks. Reads data row by row aand displays the data in 
a tabular form along with the row total column total and grand total.
*/ 
import java.util.*;
class tableMatrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int i,j,k,m,n,temp;
System.out.println("Enter number of rows");
m=sc.nextInt();
System.out.println("Enter number of columns");
n=sc.nextInt();
int table[][]= new int[m+1][n+1];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Enter element ("+(i+1)+","+(j+1)+")");
table[i][j]=sc.nextInt();
}
}
for(i=0;i<m;i++)
{
temp=0;
for(j=0;j<n;j++)
{
temp+=table[i][j];
}
table[i][n]=temp;
}
for(i=0;i<n+1;i++)
{
temp=0;
for(j=0;j<m+1;j++)
{
temp+=table [j][i];
}
table[m][i]=temp;
}
for(i=0;i<m+1;i++)
{
for(j=0;j<n+1;j++)
{
if(j==n)
System.out.print("|");
System.out.print(table[i][j]+"\t");
}
if(i==m-1)
{
System.out.println("");
for(k=0;k<n+1;k++)
System.out.print("________");
System.out.println("");
}
else
System.out.println("");
}
}
}
