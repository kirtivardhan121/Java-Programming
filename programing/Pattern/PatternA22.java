import java.util.Scanner;
class PatternA22
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=sc.nextInt();
int space=n/2,star=1;
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
space--;
star++;
}
else
{
space++;
star--;
}

System.out.println();
}
}
}
