import java.util.*;
public class largest1
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n,t;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);

System.out.println("4th tallest :"+a[3]);
}

}
