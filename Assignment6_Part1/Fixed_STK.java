import pkg_Stack.Interface_STK;

public class Fixed_STK implements Interface_STK
{
    int stack[] = new int[MAX];
    int top = 0;
    
    public void push(int a)
    {
        if (top == MAX)
        {
            System.out.println("The stack is full");
        }
        else
        {
            stack[top++] = a;
        }
    }
    public int pop()
    {
        if(top == -1)
        {
            return -1;
        }
        else
        {
            top--;
            return stack[top]; 
        }
    }

    public void displaySTK()
    {
        System.out.println("Stack elements:\n");
        for(int i = 0; i < top; i++)
        {
            System.out.println(stack[i]);
        }
    }
    public void displayStkTop()
    {
        System.out.println("Stack Top: "+stack[top-1]);
    }
}
