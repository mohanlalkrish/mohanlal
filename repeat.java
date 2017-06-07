import java.util.*;
import java.io.*;
class repeat
{
public static void main(String rgs[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int j,count=0;
for(j=0;j<n;j++)
{
 a[j]=s.nextInt();
}
for(int i=0;i<n;i++)
{

for(int k=i+1;k<n;k++)
{
if(a[i]==a[k])
{ count=count+1;
if(count==1)
{
       System.out.println("Repeated numbers are : " + a[i]);
   } }
}
}
}
}
