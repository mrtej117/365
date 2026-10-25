
import java.util.ArrayList;

class Arraylist{

    public static void main(String args[]){

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("Bananna");


        System.out.println(fruits);


        fruits.remove("Apple");
        fruits.remove("Mango");

        System.out.println("After removing");
        System.out.println(fruits);

        System.out.println("Traversing");
        for(int i = 0 ; i < fruits.size() ; i++){
            System.out.println(fruits.get(i));
        }



    }

}