package String;
import java.util.Scanner;

public class palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s1="";
//        for(int i=0;i<s.length();i++){
//            s1=s.charAt(i)+s1;
//        }
//        if(s.equals(s1))
//            System.out.println("this is palandrom string");
//        else
//            System.out.println("this is not palandrom string");
        String s=sc.nextLine();
        String s1="";
        for ( int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
        if (s.equals(s1)){
            System.out.println("this String is a palendrom String");
        }
        else{
            System.out.println("this string is not a palendrom String");
        }

    }
}