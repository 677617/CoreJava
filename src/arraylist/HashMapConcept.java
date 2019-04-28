package arraylist;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    //HashMap is a class implements map interface
    //extends AbstractMap
    //it contains only unique element
    //stores the value in key- value pair
    //it may have one null key and multiple null values
    //it maintains no order
    //non synchrozied -multithread -fast->performance
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        hm.put(1,"selenium");
        hm.put(2,"TestComplete");
        hm.put(3,"QTP");
        hm.put(4,"Mother");
        hm.put(1,"sjhjh");

        //get the value

        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

//        hm.remove(1);
        System.out.println(hm);


        //user defined class object
        Employee e1=new Employee("satish",28,"Finance");
        Employee e2=new Employee("Santosh",29,"homemaker");
        Employee e3=new Employee("Pankaj",32,"Mechanical");

        HashMap<Integer,Employee> hashMap=new HashMap<Integer, Employee>();
        hashMap.put(1,e1);
        hashMap.put(2,e2);
        hashMap.put(3,e3);

        for(Map.Entry<Integer,Employee> map:hashMap.entrySet()){
           int key= map.getKey();
           Employee e= map.getValue();
            System.out.println("**************************");

            System.out.println(key+""+e.dept+e.age+e.name);

        }
    }





}
