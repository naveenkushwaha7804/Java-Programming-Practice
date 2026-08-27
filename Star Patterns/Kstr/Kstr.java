```
package Star;


class Kstr {
    public static void main(String[] args) {


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j==0  ||  i+j==3 || ( i+j==((i-1)*2)-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}



```