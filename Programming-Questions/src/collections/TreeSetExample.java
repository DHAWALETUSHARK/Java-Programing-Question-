package collections;

import java.util.*;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        
        System.out.println("First: " + set.first());
        set.remove(20);      // Remove one

        for (int num : set) {
            System.out.println(num);
        }
    }
}

