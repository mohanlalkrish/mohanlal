import java.util.*;
public class largest
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n,t;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}Arrays.sort(a);
}
}
System.out.println("4th tallest :"+a[3]);
}

}
