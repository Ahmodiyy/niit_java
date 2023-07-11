package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Students s1 = new Students("Alex", 88);
        Students s2 = new Students("Bob", 90);
        Students s3 = new Students("Joe", 78);

        ArrayList<Students> obj = new ArrayList<>();
        obj.add(s1);
        obj.add(s2);
        obj.add(s3);

        System.out.println("Student details are:");

        ListIterator li = obj.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        Collections.sort(obj, new MarkCompare());

        System.out.println("Mark wise sort:");

        ListIterator li2 = obj.listIterator();

        while (li2.hasNext()) {
            System.out.println(li2.next());
        }
        //Collections.sort(obj, new NameCompare());
//
//        System.out.println("Name wise sort:");
//
//        ListIterator li3 = obj.listIterator();
//
//        while (li3.hasNext()) {
//            System.out.println(li3.next());
//        }
    }
}

