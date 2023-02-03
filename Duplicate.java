import java.util.Scanner;
public class Duplicate{
 public static void main(String[] args) {
 try{
 int i,j,x=1;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter no of elements in array:");
 int n =s.nextInt();
 int arr[]=new int[n];
 for(i=0;i<n;i++)
 {
 System.out.print("Enter element "+(i+1)+" =");
 arr[i]=s.nextInt();
 }
 for(i=0;i<n;i++)
 {
 if(arr[i]==0)
 {
 x=0;
 }
 }
 for(i=0;i<n;i++)
 {
 for(j=0;j<i;j++)
 {
 if(arr[i]==arr[j])
 {
 arr[i]=0;
 arr[j]=0;
 }
 }
 }
 if(x==0)
 {
 System.out.print("0");
 }
 for(i=0;i<n;i++)
 {
 if(arr[i]!=0)
 {
 System.out.print(" "+arr[i]);
 }
 }
 }
 catch(Exception e)
 {
 System.out.println("Invalid");
 }
 }
}