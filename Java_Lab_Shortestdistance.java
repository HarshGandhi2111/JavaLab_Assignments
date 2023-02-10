import java.util.Scanner;
public class Java_Lab_Shortestdistance
{
     public static void main(String[] args) 
    {
            int index = 0, range;
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
            for (int i = 1; i < range - 1; i++) 
            {
                if (( numbers[index] - numbers[index + 1]) > (numbers[i] - numbers[i + 1])) 
                {
                    index = i;
                }
                
            }
            System.out.printf("The index is: %d",index);
        }
    }
