package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {


        String str = "Batch20 School";

        str.charAt(6);
        str.charAt(5);
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0);


        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) { // statement
            result += str.charAt(i); // loop=will retrive each of the characters


        }
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        String str2 = scan.nextLine();

        String result2 = "";

        for (int i = str2.length() - 1; i >= 0; i--) {
            result2 += str2.charAt(i);
        }
        System.out.println(result2);


        String result3 = "";
        int index = str.length()-1;

        while (index>=0){
            result3 += str.charAt(index);

            index-=1;

        }
        System.out.println(result3);

    }
}