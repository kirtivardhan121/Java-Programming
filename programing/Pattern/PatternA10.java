import java.util.Scanner;
class PatternA10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<i;j++)
{
System.out.print(" ");
}
for(int j=i;j<=2*n-i;j++)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}