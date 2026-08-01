// package Other;
import java.util.Scanner;
class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of hardness");
        float hardness=sc.nextFloat();
        System.out.println("enter the value of carbon");
        float carbon=sc.nextFloat();
        System.out.println("enter the  of tensile");
        float tensile=sc.nextFloat();
        if(hardness>50 && carbon<0.7 && tensile>5600)
            System.out.println("Grade 10");
        else if(hardness>50 && carbon<0.7)
            System.out.println("grade 9");
        else if(carbon<0.7 && tensile>5600)
            System.out.println("Grade 8");
        else if(hardness>50 && tensile>5600)
            System.out.println("Grade 7");
        else if( hardness>50 || carbon<0.7 || tensile>5600)
            System.out.println("Grade 6");
        else
            System.out.println("Grade 5");
    }
}
