import java.util.*;
class sum
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= a; i++)
        {
            sum = sum + i;    
            
        }
 System.out.println("Sum after adding is : " + sum);
    
    }
}
