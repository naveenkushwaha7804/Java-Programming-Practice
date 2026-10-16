import java.util.Scanner;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        System.out.println(capitalizeFirstAndLast(words));

        sc.close();
    }

    // Har word ka pehla aur aakhri letter capital karta hai
    public static String capitalizeFirstAndLast(String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            if (word.length() == 1) {
                result.append(word.toUpperCase());
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word, 1, word.length() - 1);
                result.append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}