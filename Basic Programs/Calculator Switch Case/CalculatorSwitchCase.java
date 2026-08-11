```
import java.util.Scanner;
class CalculatorSwitchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        float a=sc.nextFloat();
        System.out.println("enter the value of b");
        float b=sc.nextFloat();
        System.out.println("enter the  of operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            default :
                System.out.println("wrong input");






        }

    }
} 