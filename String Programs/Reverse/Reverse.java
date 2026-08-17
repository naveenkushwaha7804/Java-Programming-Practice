
package String;
import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      int l=0;
      int r=s.length()-1;
      char arr[]=s.toCharArray();
       while(l<r){
           char temp=arr[l];
            arr[l] =arr[r];
           arr[r] =temp;
         l++;
         r--;
       }
       s=Arrays.toString(arr);
System.out.println(s);
    }
}