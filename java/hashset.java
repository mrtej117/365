//  used to store the unique elements
// Allows one Null element
// collection frame work

import java.util.HashSet;

import java.util.Iterator;

import javax.swing.text.InternationalFormatter;

class hashSet{
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();


        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        System.out.println(set);

        System.out.println(set.contains(30));


        set.remove(20);

        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.size());

        
    }
}