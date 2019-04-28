package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

    public static void main(String[] args) {
//Generics
        //add method

        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("test");
        ar1.add("Java");
        ar1.add("Money");

        ArrayList<String> ar2=new ArrayList<String>();
        ar2.add("Java");
        ar2.add("Mother");
        ar2.add("C++");
// gives unique element in the tqo arrayList
        ar1.retainAll(ar2);
        System.out.println(ar1);


        //user defined class object
        Employee e1=new Employee("satish",28,"Finance");
        Employee e2=new Employee("Santosh",29,"homemaker");
        Employee e3=new Employee("Pankaj",32,"Mechanical");

        List<Employee> ar3=new ArrayList<Employee>();
        ar3.add(e1);
        ar3.add(e2);
        ar3.add(e3);

        //Three ways for displaying or interatiing values
        //1. Iterator
        Iterator<Employee> it=ar3.iterator();
        while(it.hasNext()){
           Employee e= it.next();
            System.out.println(e.age);
        }
        //use size() method
        for(int i=0;i<ar3.size();i++){
            System.out.println(ar3.get(i).age);
            System.out.println(ar3.get(i).name);
            System.out.println(ar3.get(i).dept);
        }
        for (Employee e:ar3) {
            System.out.println(e.age);
            System.out.println(e.name);
            System.out.println(e.dept);
        }





    }




}
