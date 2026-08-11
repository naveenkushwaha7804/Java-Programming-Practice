
package String;
import java.util.Scanner;

public class Uppertolower
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars= input.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            else if(Character.isLowerCase(chars[i])){
                chars[i]= Character.toUpperCase(chars[i]);

            }
        }
        System.out.println("Inout:" + input);
        String output = new String(chars);
        System.out.println("Output:" + output);
    }} 