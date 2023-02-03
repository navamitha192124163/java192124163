import java.util.Scanner;
public class Composite_num_in_array {
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter no of elements in the array");
 int n=s.nextInt();
 int arr[]=new int[n];
 System.out.println("Enter the elements of the array one by one");
 int i,j,x,k,lk=0;
 for(i=0;i<n;i++)
 {
 arr[i]=s.nextInt();
 }
 for(i=0;i<n;i++)
 {
 k=0;
 for(j=2;j<arr[i];j++)
 {
 if(arr[i]%j==0)
 {
 k=k+1;
 }
 }
 if(k>0)
 {
 lk=lk+1;
 }
 }
 System.out.println("total no of composite numbers are="+lk);
 }
}