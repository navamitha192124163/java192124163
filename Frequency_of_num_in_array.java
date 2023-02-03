import java.util.Scanner;
public class Frequency_of_num_in_array {
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter no of elements in the array");
 int n=s.nextInt();
 int arr[][]=new int[n][2];
 System.out.println("Enter the elements of the array");
 int i,j;
 for(i=0;i<n;i++)
 {
 arr[i][0]=s.nextInt();
 }
 for(i=0;i<n;i++)
 {
 arr[i][1]=1;
 }
 for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
 {
 if(arr[i][0]==arr[j][0])
 {
 arr[j][0]=-1;
 arr[i][1]=arr[i][1]+1;
 }
 }
 }
 System.out.println("The output table is:=");
 System.out.println("Element | Frequency");
 System.out.println("---------------------");
 for(i=0;i<n;i++)
 {
 if(arr[i][0]!=-1)
 {
 System.out.println(" "+arr[i][0]+" | "+arr[i][1]);
 }
 }
 }
}