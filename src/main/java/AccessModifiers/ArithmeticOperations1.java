package AccessModifiers;

public class ArithmeticOperations1 {
//         Default access modifier
        int a;
         int b;
         int total;

        void addition(){
            total = a+b;

        }
        void printResult(){
            System.out.println("The sum is :"+"Total");
        }
        ArithmeticOperations1(){
            a=100;
            b=200;
        }
        public static void main (String[]args)
        {
            ArithmaticOPerations1 obj = new ArithmaticOPerations1();
            obj.addition();
            obj.printResult();
        }
    }


