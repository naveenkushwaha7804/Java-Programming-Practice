package Star;

import java.util.Scanner;

public class SPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (odd number, 5 or more): ");
        int size = sc.nextInt();

        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean top = (i == 0) && (j != 0);
                boolean bottom = (i == size - 1) && (j != size - 1);
                boolean middle = (i == mid) && (j != 0) && (j != size - 1);
                boolean leftSide = (j == 0) && (i > 0) && (i < mid);
                boolean rightSide = (j == size - 1) && (i > mid) && (i < size - 1);

                if (top || bottom || middle || leftSide || rightSide) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}// Prints letter S using stars (use odd size)
