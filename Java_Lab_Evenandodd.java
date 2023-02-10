import java.util.Scanner; 
import java.util.Arrays;

public class Java_Lab_Evenandodd
{
    public static void main(String[]args)
    {
        Evenandodd eo = new Evenandodd();
        int range;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the range of the arrays= ");
        range = sc.nextInt();
        eo.EvenandOdd(range);
    }
}

class Evenandodd
{
    Scanner sc = new Scanner(System.in); 
    void EvenandOdd(int range)
    {
        int even[] = new int[range];
        int odd[] = new int[range];
        int element;
        int count = 0, count1 = 0;
        for (int i = 0; i < range; i++)
            {
                System.out.printf("Element %d=", i+1);
                element = sc.nextInt();
                if(count <= range && count1 <= range)
                {
                    if(element % 2 == 0)
                    {
                        even[count] = element;
                        count++;
                    }
                    else
                    {
                     odd[count1] = element;
                     count1++;
                    }
                } 
            }
            System.out.println("List of even numbers=");
            for (int i = 0; i < count; i++)
            {
                System.out.printf("%d ",even[i]);
            }
            System.out.println("\nList of odd numbers=");
            
            for (int i = 0; i < count1; i++)
            {
                System.out.printf("%d ",odd[i]);
            }
    }
}
