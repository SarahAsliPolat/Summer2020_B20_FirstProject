package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {
    // remove, size, set, get, equals, contains, clear
    public static void main(String[] args) {

        ArrayList<String>cars = new ArrayList<>();
        cars.addAll(Arrays.asList("Mazda","BMW","Mercedes","Audi","Infinity","Volvo","WV","WV","WV","Lamborghini","Lexus"));


        cars.remove(3);//removing by using index number
        cars.remove("WV"); // removing by using the name
        cars.removeAll(Arrays.asList("WV"));//removing multiple element
        cars.removeIf(p->p.toLowerCase().contains("m"));//removing the cars that has m in its  name
        cars.retainAll(Arrays.asList("Volvo"));

        System.out.println(cars);

        System.out.println("======================================");

        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.addAll(Arrays.asList("Milk","egg","water","apple","banana","coffee"));

        boolean r1= groceryList.contains("water");
        System.out.println(r1);

        boolean r2= groceryList.containsAll(Arrays.asList("chocolate","bread","fish"));
        System.out.println(r2);

        System.out.println("total numbers of items: "+groceryList.size());

        //set the coffee to apple cider
        groceryList.set(groceryList.size()-1,"apple cider");
        groceryList.set(groceryList.indexOf("apple"),"strawberry");
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);

    }
}