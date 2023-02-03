import java.util.Scanner;
public class CubeSquare{
 public static void main(String[] args)
 {
try{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter an number");
 double n=s.nextDouble();
 double a=0,b=0;
 a=n*n;
 b=n*n*n;
 System.out.println("The square of number="+a);
 System.out.println("The cube of number="+b);
 }
 catch(Exception e)
 {
 System.out.println("Invalid");
 }

 }
}