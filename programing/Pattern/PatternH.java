import java.util.Scanner;
class PatternH
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of lines to print");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
count++;
System.out.print((char)(count+96)+" ");
}
System.out.println();
}
}
}