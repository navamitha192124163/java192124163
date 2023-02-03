import java.io.*;
import java.util.*;
public class ConsonantsVowels{
 public static void main(String[] args) {
try{
 System.out.println("Enter an String:");
 InputStreamReader r=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(r);
 String s1 = br.readLine();
 String c=" ";
 String v=" ";
 int x=s1.length();
 int i;
 for(i=0;i<x;i++)
 {

if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')|
|(s1.charAt(i)=='A')||(s1.charAt(i)=='E')||(s1.charAt(i)=='I')||(s1.charAt(i)=='U'))
 {
 c=c+s1.charAt(i)+' ';
 }
 else
 {
 v=v+s1.charAt(i)+' ';
 }
 }
 System.out.println("Consonants-: "+v);
 System.out.println("Vowels-: "+c);
}
 catch (Exception e)
 {
 System.out.println(e);
 }
 }
}