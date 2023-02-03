import java.util.*;
class common{
 public static void main(String[] args){
 Scanner a=new Scanner (System.in);
 System.out.println("enter hte number of element is 1st array");
 int n1=a.nextInt();
 int[] arr1=new int[n1];
 System.out.println("enter hte number of element is 2nd array");
 int n2=a.nextInt();
 int[] arr2=new int[n2];
 for(int i=0;i<n1;i++){
 arr1[i]=a.nextInt();
 }
 for(int i=0;i<n2;i++){