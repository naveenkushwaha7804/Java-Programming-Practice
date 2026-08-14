package String;
import java.util.Scanner;

public class SplitStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String reversedStr = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedStr += arr[i] + " ";
        }

        System.out.println(reversedStr);
    }
}