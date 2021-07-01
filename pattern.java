import java.util.*;
class pattern
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.print("enter the value of n");
n=sc.nextInt();
for(i=0;i<=n-1;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("*"+" ");
}
System.out.println("");
}
for(i=n-1;i>=0;i--)
{
for(j=0;j<=i-1;j++)
{
System.out.print("*"+" ");
}
System.out.println("");
}
}
}
