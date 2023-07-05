package dataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDs {
    static class Contact{
        String name;
        Integer number;
    }

    public static void main(String[] args) {
        Set<Integer> contacts = new HashSet<>();
        contacts.add(3);
        contacts.add(4);
        Iterator<Integer> iterator = contacts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
