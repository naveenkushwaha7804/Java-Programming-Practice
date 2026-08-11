import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        //- 100 रुपये से कम या बराबर: 5%
        //- 200 रुपये से कम या बराबर: 12%
        //- 400 रुपये से कम या बराबर: 15%
        //- 800 रुपये से कम या बराबर: 25%
        //- 1500 रुपये से अधिक: 25%
        if (a <= 200)
        System.out.println(a - ((a * 5) / 100));
        else if (a <= 400)
        System.out.println(a - ((a * 12) / 100));
        else if (a <= 800)
        System.out.println(a - ((a * 15) / 100));
        else
        System.out.println(a - ((a * 25) / 100));

    }

}