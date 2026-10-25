import java.util.LinkedList;


class linkedlist{

    public static void main(String args[]){

        LinkedList<Integer> number = new LinkedList<>();


        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(40);
        System.out.println(number);

        number.addFirst(5);
      
        System.out.println("After adding the first Element" + number);
        number.addLast(15);
        System.out.println("After Adding the Last Element " + number );

        System.out.println("After removing the first and and last elements: ");

        number.removeFirst();
        System.out.println("After removing the first element "+number); 


        number.removeLast();
        System.out.println("After Removing the last element "+ number);


        System.out.println("elements in the Linked List are: ");
        for(int i = 0 ; i < number.size() ; i++){
            System.out.println(number.get(i));
        }

        
    }



}
