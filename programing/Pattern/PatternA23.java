import java.util.Scanner;
class PatternA23
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=sc.nextInt();
int space=0,star=n;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int j=1;j<=star;j++)
{
System.out.print("*");
}
if(i<=n/2)
{
space++;
star=star-2;
}
else
{
space--;
star=star+2;
}

System.out.println();
}
}
}
