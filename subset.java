import java.util.*;
class subset
{
public static void main(String args[])
{
int[] main={1,2,3,4,5,6,7};
int[] sub={1,2,3,4,5,6};
 {
int count = 0;
for (int i = 0; i < main.length; i++)
 {
    for (int j = 0; j < sub.length; j++)
    {
        if (main[i] == sub[j])
       {
            main[i] = -1;
            count++;
            break;
        }
    }
}
if (count == sub.length)
    System.out.println("is a subset");
else
    System.out.println("is not a subset");
}
}
}
