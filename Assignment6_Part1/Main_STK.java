public class Main_STK
{
    public static void main(String[] args)
    {
        Fixed_STK stk = new Fixed_STK();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.displaySTK();
        stk.displayStkTop();
        stk.pop();
        stk.displaySTK();
        stk.displayStkTop();
        System.out.println("\n* * * * * * * * *\n");
        System.out.println("Growable Stack:\n");
        Growable_STK gstk = new Growable_STK();
        gstk.push(1);
        gstk.push(2);
        gstk.push(3);
        gstk.push(4);
        gstk.push(5);
        gstk.push(6);
        gstk.displaySTK();
        gstk.displayStkTop();
        gstk.pop();
        gstk.displaySTK();
        gstk.displayStkTop();
    }
}