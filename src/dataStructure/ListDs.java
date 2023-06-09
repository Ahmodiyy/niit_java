package dataStructure;

import java.util.ArrayList;
import java.util.ListIterator;

 import java.util.LinkedList;
         import java.util.ListIterator;

 class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList<Integer> obj = new LinkedList<Integer>();

        Integer iobj1 = 101;
        Integer iobj2 =102;
        Integer iobj3 = 103;
        Integer iobj4 = 104;

        System.out.println("Size of LinkedList is: " + obj.size());

        obj.add(iobj1);
        obj.add(iobj2);
        obj.add(iobj3);
        obj.add(iobj4);
        obj.add(iobj1);

        System.out.println("\nLinkedList after adding the objects: " + obj);
        System.out.println("Size of LinkedList after adding objects: " + obj.size());

        obj.remove(iobj2);
        obj.remove(iobj3);

        System.out.println("\nLinkedList after removing the objects: " + obj);
        System.out.println("Size of LinkedList after removing objects: " + obj.size());

        System.out.println("\nThe final LinkedList: ");
        ListIterator i = obj.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

