import java.util.Scanner;
import java.math.*;
public class Perfect_sqr {
 public static void main(String[] args) {
 try{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter an number");
 int n=s.nextInt();
 double y=Math.sqrt(n);
 System.out.print("The answer is="+y+", ");
 System.out.println(-y);
 }
 catch(Exception e)
 {
 System.out.println("Invalid");
 }
 }
}