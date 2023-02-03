import java.util.Scanner;
public class numbers_bw_MN
{
 public static void main(String[] args)
 {
 Scanner s=new Scanner(System.in);
 System.out.println("to print the numbers from M to N by skipping K numbers in
between");
 System.out.println("Enter the values of M,N,and K");
 int M,N,K,i,j,b=-5,m,n,t;
 m=s.nextInt();
 n=s.nextInt();
 K=s.nextInt();
 System.out.println("The result is");
 if(m!=n)
 {
 if(n<m)
 {
 M=n;
 N=m;
 }
 else
 {
 M=m;
 N=n;
 }
 for(i=M;i<=N;i++)
 {
 System.out.println(i+" ");
 i=i+K;
 }

 }
 else
 {
 System.out.println("zero");
 }
}
}