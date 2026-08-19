
package String;
import java.util.Scanner;

public class elementsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        int index=s.indexOf(s1);
//        if (index!=-1)
//            System.out.println(index);
//        else System.out.println(-1);


//        if (s.contains(s1))
//            System.out.println(0);
//        else
//            System.out.println(-1);
       if(s.contains(s1))
           System.out.println(index);
       else System.out.println(-1);
    }
    }