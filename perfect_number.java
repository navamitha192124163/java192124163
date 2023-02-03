import java.util.Scanner;
public class perfect_number{
 public static void main(String[] args)
 {
 try{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter an number");
 int n=s.nextInt();
 int i,j,x=0;
 for(i=1;i<n;i++)
 {
 if(n%i==0)
 {
 x=x+i;
 }
 }
 if(x==n)
 {
 System.out.println(x+" is an perfect number");
 }
 else
 {
 System.out.println(" is not an perfect number");
 }
 if(n<0)
 {
 for(i=-1;i>n;i--)
 {
 if(n%i==0)
 {
 x=x+i;
 }
 }
 if(x==n)
 {
 System.out.println(" is an perfect number");
 }
 else
 {
 System.out.println(" is not an perfect number");
 }
 }
 }
 catch(Exception e)
 {
 System.out.println("Invalid");
 }

 }
}