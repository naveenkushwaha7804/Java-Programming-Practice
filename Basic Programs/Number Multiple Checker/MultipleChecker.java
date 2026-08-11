import java.util.Scanner;
class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int value=sc.nextInt();
        System.out.println("enter the value which you want to know this is multiple or not of entered value");
        int a=sc.nextInt();
        if (value%a==0)
            System.out.println("it is multiple of entered value");
        else

            System.out.println("it is  not of entered value multiple");
    }
}
