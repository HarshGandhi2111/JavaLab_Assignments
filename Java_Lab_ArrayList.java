import java.util.Scanner;
import java.util.Arrays;
public class Java_Lab_ArrayList
{
    public static void main(String[] args) 
    {
            int range;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the range =");
            range = sc.nextInt();
            int numbers[] = new int[range];
            System.out.println("Enter the elements of the array=");
            for(int i = 0; i<range; i++)
            {
                System.out.printf("Element %d:", i+1);
                numbers[i] = sc.nextInt();
            }
            System.out.print("The Array List: ");
            System.out.println(Arrays.toString(numbers));
    }
}
