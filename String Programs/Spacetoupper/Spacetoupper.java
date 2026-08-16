
package String;
import java.util.Scanner;

public class Spacetoupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println();
            } else {
                if(i>0 && s.charAt(i-1)==' ' || i==0){
                    System.out.print(Character.toUpperCase(s.charAt(i)));
                } else
                System.out.print(s.charAt(i));
            }
        }
    }
}
