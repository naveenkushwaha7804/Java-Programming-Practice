package Star;
import java.util.Scanner;
class Pstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ( (i==0 && j!=0 && j!=a-1) || ( i!=0 && j==0) || (i==a/2 && j!=a-1) || (j==6 && i!=0 && i<=a/2-1))
                    System.out.print("* ");
                else
                    // (i==a-1 && j!=a-1)
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}