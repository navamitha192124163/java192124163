import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int i,j;
try{
Scanner s=new Scanner(System.in);
System.out.println("To print the multiplication table of m upto
n");
System.out.println("Enter the values of m and n");
int m=s.nextInt();
int n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(i+"x"+m+"="+(m*i));
}
if(n<0)
{
System.out.println("Invalid");
}
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}