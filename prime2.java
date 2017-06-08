import java.util.Scanner;
class prime2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

int i,c=0;
int n=s.nextInt();
int n1=s.nextInt();
for(i=n;i<n1;i++)
{
  if(i%2!=0&&i%3!=0&&i%5!=0)    
 { 
c++;
         

}
}
System.out.println(c);
}  
}  
