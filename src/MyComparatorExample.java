import Lambda.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class MyComparatorExample {
    public static void main(String[] args){
        List<Integer> listExample=new ArrayList<>();
        listExample.add(10);
        listExample.add(50);
        listExample.add(30);
        listExample.add(60);
        listExample.add(20);
        listExample.add(40);
        listExample.add(100);
        System.out.println("Before Swapping "+listExample);
        Collections.sort(listExample,(i1,i2)-> i1>i2?-1:i1<i2?1:0);
        System.out.println("After Swapping "+listExample);


    }
//    public static void main(String[] args) {
//        FunctionalInterface f = (n) -> 0;
//        List<String> l = new ArrayList<>();
//        Predicate p = (b)->false;
//        l.stream().filter((b)->false).map(o -> o.trim());
//    }
}
