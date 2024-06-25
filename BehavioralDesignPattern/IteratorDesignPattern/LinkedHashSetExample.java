package BehavioralDesignPattern.IteratorDesignPattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(2);
        set.add(5);
        set.add(1);
        
        Iterator<Integer> iterable = set.iterator();
        while (iterable.hasNext()) {
            int val = iterable.next();
            System.out.println(val);
        }
    }
}