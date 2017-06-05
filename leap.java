import java.util.Scanner;

class leap
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%4==0) 
{
System.out.println("leapyear "+a);
}
else
{
System.out.println("not leap year"+a);
}
}
}
