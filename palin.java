import java.util.Scanner;
class palin
{
public static void main(String args[])
{
int n=new Scanner(System.in).nextInt();
  int r,sum=0,temp;    
  
  temp=n;    
  while(n>0)
{    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
