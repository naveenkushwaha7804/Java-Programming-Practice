package Star;

import java.util.Scanner;

public class UPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean leftSide = (j == 0) && (i != size - 1);
                boolean rightSide = (j == size - 1) && (i != size - 1);
                boolean bottom = (i == size - 1) && (j != 0) && (j != size - 1);

                if (leftSide || rightSide || bottom) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}// Prints letter U using stars
