import java.io.*;
import java.util.*;
class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
{
System.out.println("alphabet");
}
else
{
System.out.println("number");
}
}
}
