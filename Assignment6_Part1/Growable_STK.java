

import java.util.ArrayList;
import pkg_Stack.Interface_STK;

public class Growable_STK implements Interface_STK
{
    private final ArrayList<Integer> stack;
    private int top;
    public Growable_STK() 
    {
        stack = new ArrayList<Integer>();
    }
    public void push(int a)
    {
        stack.add(top++, a);
    }
    public int pop()
    {
        if(top == -1)
        {
            return -1;
        }
        else{
            top--;
            return stack.get(top);
        }
    }
    public void displaySTK()
    {
        System.out.println("Stack elements:\n");
        for(int i = 0; i < top; i++)
        {
            System.out.println(stack.get(i));
        }
    }
    public void displayStkTop()
    {
        System.out.println("Stack Top: "+stack.get(top-1));
    }
}   
