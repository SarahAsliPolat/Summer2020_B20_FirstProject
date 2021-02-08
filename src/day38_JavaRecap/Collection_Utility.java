package day38_JavaRecap;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    /*
        Collections Class:
            Collections.sort()
            Collections.swap()
            Collections.frequency()

            Collections.max()
            Collections.min()
            Collections.replaceAll()
     */

    public static void main(String[] args) {
        //SWAP
        ArrayList<Character> chars =new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','K','A','D','C','M','B'));
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String> students =new ArrayList<>();
        students.addAll(Arrays.asList("Betul","Rana","Zeynep","Ela","Asli","Baris"));
        Collections.swap(students,1,3);
        System.out.println(students);
        Collections.swap(students,4,students.size()-1);
        System.out.println(students);

        //FREQUENCY
        ArrayList<String> items= new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","egg","donut","water","salt","avacado","water","egg","egg","salt","salt"));
        int count= Collections.frequency(items,"water");
        int count2 =Collections.frequency(items,"egg");
        int count3 = Collections.frequency(items,"donut");
        int count4 = Collections.frequency(items,"salt");
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);


        ArrayList<String> unique= new ArrayList<>();

        for(String each :items){
            int i = Collections.frequency(items,each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
        ArrayList<String> unique2 =new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p->Collections.frequency(unique2,p)>1);
        System.out.println(unique2);


        //MAX _ MIN

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,4,1,6,9,80,6,55,-1));
        Integer max = Collections.max(num1);
        Integer min = Collections.min(num1);

        System.out.println("maximum number is :"+max);
        System.out.println("minimum number is :"+min);

      //REPLACEALL

        Collections.replaceAll(num1,1,2);
        System.out.println(num1);


    }
}