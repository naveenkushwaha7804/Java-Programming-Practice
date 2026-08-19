package String;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string ");
//        String s = sc.nextLine();
//        char arr[] = s.toCharArray();
//        int frq[] = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            frq[i] = 1;
//            for (int j = i + 1; j < s.length(); j++) {
//                if (arr[i] == arr[j]) {
//                    frq[i]++;
//                   // arr[j] = '0';
//                }
//            }
//        }
//        System.out.println("Characters and their corresponding frequencies");
//        for (int i = 0; i < frq.length; i++) {
//            if (arr[i] != ' ' && arr[i] != '0')
//                System.out.println(arr[i] + " present :" + frq[i]+" times");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int freq[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            freq [i]=1;
            for(int j=1;j<s.length();j++){
              if  (arr[i]==arr[j]){
                  freq[i]++;
                  arr[j]='0';

              }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  present"+freq[i] +" times");
        }

    }
}