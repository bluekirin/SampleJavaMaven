package org.example;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);

        map.put(3, list3);
        map.put(2, list2);
        map.put(1, list1);

        map.entrySet().stream().flatMap(o -> o.getValue().stream()).forEach(System.out::println);

        a(map);
        Rec r = new Rec(100, 200);
        int x = r.i();
        System.out.println(x);


        var t = new Tuple(1,2);
        int a = t.x();

    }


    static void a(Object o) {


        if ( o instanceof String s && s.length() == 5 ) {
            System.out.println(s);
        } else if ( o instanceof Map m){
            System.out.println(m);
        }

        boolean b = o instanceof String a;
    }

    record Rec(int i){
        Rec {
            System.out.println("*"+i);
        }

        Rec(int i, int j) {
            this(i);
        }
        public int getI(){
            return i;
        }
    }

}
record Tuple(int x, int y){
}
