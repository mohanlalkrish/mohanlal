import java.io.*;
import java.util.*;
class strrev
{
public static void main(String[] 
{
Scanner s=new Scanner(System.in);
String str[] =s.nextLine().split(" ");
String finalStr=s.nextLine();
        for(int i = str.length-1; i>= 0 ;i--)
        {
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}
