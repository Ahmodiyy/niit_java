package dataStructure;


import java.util.*;

class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> obj = new HashMap<String, Integer>();
        obj.put("L1", 11);
        obj.put("L2", 22);
        System.out.println("Size of HashMap after adding objects: " + obj.size());
        //obj.remove("L3");
        System.out.println("Size of the HashMap after removing objects: " + obj.size());
//        Set<Map.Entry<String,Integer>> set  = obj.entrySet();
//        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> next  = iterator.next();
//            System.out.println(next.getKey());
//            System.out.println(next.getValue());
//        }

        Iterator iterator1 = obj.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }




    }
}
