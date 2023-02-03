import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int i=0;
System.out.println("Enter the date/month/year");
Scanner s=new Scanner(System.in);
String re=s.next();
String[] r=re.split("/",3);
int x=Integer.parseInt(r[2]);
if(x%4==0)
{
System.out.println("It is an leap year");
}
else{
System.out.println("It is not a leap year:");
}
}
}