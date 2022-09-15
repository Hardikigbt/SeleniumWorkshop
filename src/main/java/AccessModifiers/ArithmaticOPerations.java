package AccessModifiers;

public class ArithmaticOPerations {
    private int a;
    private int b;
    private int total;

   private void addition(){
        total = a+b;

    }
    private void printResult(){
       System.out.println("The sum is :"+"Total");
    }
    ArithmaticOPerations(){
       a=100;
       b=200;
    }
    public static void main (String[]args)
    {
       ArithmaticOPerations obj = new ArithmaticOPerations();
       obj.addition();
       obj.printResult();
    }
}
