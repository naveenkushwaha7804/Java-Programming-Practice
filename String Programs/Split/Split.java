package String;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String S1;
            if (arr[i].length() == 1) {
                S1 = arr[i].toUpperCase();
            } else {
                S1 = Character.toUpperCase(arr[i].charAt(0)) +
                        arr[i].substring(1, arr[i].length() - 1) +
                        Character.toUpperCase(arr[i].charAt(arr[i].length() - 1));
            }
            System.out.println(S1);
        }
    }
}