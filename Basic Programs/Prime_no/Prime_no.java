
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            boolean prime = false;
            for (int j= 2 ;j < i;j++)
            {
                if (i % j == 0) {
                    prime = true;
                }
            }
            if (!prime) {
                System.out.println(i);
            }
        }
    }
}