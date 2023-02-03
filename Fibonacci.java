import java.util.Scanner;
public class Fibonacci{
 public static void main(String[] args)
 {
try{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter an number");
 int n=s.nextInt();
 int a=0,b=1,c=0,x=n-2;
 System.out.print(a+" ");
 System.out.print(b+" ");
 while(x>0)
 {
 c=a+b;
 System.out.print(c+" ");
 a=b;
 b=c;
 x=x-1;
 }
 }
 catch(Exception e)
 {
 System.out.println("Invalid");
 }

 }
}