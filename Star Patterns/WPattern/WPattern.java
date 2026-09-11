package Star;

import java.util.Scanner;

public class WPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (5 or more): ");
        int size = sc.nextInt();

        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean leftSide = (j == 0);
                boolean rightSide = (j == size - 1);
                boolean leftDiagonal = (i == j) && (i >= mid);
                boolean rightDiagonal = (i + j == size - 1) && (i >= mid);

                if (leftSide || rightSide || leftDiagonal || rightDiagonal) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
