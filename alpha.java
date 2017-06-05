import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
if(a=='A' || a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
