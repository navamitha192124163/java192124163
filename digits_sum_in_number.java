import java.util.Scanner;
public class digits_sum_in_number{
 public static void main(String[] args)
 {
 System.out.println("Enter N value");
 Scanner s=new Scanner(System.in);
 int N=s.nextInt();
 System.out.println("Enter "+N+" digit number");
 int n=s.nextInt();
 int m=n,r,x=0;
 while(m>0)
 {
 r=m%10;
 x=x+r;
 m=m/10;
 };
 if(x<10)
 {
 System.out.println("The answer="+x);
 }
 else{
 System.out.println("Invalid");
 }
 }
}