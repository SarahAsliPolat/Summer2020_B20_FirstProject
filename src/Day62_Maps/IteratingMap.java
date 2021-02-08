package Day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {

        Map<String, LocalDate> map=new LinkedHashMap<>();
        map.put("John",LocalDate.of(1999,6,8));
        map.put("Aaron",LocalDate.of(1998,5,8));
        map.put("Daniel",LocalDate.of(1997,12,8));
        map.put("James",LocalDate.of(1996,3,8));
        map.put("Caleb",LocalDate.of(1995,4,8));
        map.put("Eric",LocalDate.of(1994,9,8));

        System.out.println(map);

        for(String each : map.keySet()){
            System.out.println(each);
        }
        List<String> names = new ArrayList<>(map.keySet());
        System.out.println(names);
        System.out.println(names.get(1));

        for(LocalDate each : map.values()){
            System.out.println(each);
        }

        List<LocalDate>DOB =new ArrayList<>();
        System.out.println(DOB.get(1));

    }
}
