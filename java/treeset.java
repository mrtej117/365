import java.util.TreeSet;
import java.util.Iterator;


class treeSet{

    public static void main(String args[]){

        TreeSet<Integer>number = new TreeSet<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(20);
        number.add(50);
        number.add(5);

        System.out.println("Elements in the TreeSet: "+number);

        System.out.println(number.contains(50));


        number.remove(50);

        System.out.println("After removing the Element: "+number);


        Iterator<Integer> it = number.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(number.size());


       
    }
}