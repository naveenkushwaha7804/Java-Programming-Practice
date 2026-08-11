
package String;
import java.util.Scanner;

public class Vobles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int vobles = 0;
        int consonent = 0;
        int Space=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {

                vobles++;
            } else if (s.charAt(i) == ' ')
                Space++;
            else
                consonent++;

        }
        System.out.println("vobles:" +vobles);
        System.out.println("consonent:" +consonent);
    }
}