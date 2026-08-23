
Qstr · JAVA
package Star;
import java.util.Scanner;
 
class Qstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i+j==3 || (i+j==((i+1)*2)+1) || (i+j==((j+1)*2+1)) || (i+j==9 && i>=a/2) || (i+j==j*2 && i>=a/2)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
 
            }
            System.out.println();
        }
    }
}
 
Explain