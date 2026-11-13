class exception2{

        public static void main(String args[]){
                try{
                int i = 10;
                int j = 0;
                int z = i / j;
                System.out.println(z);
                try{
                        int arr[] ={1,2,3,4,5};
                        System.out.println(arr[9]);

                }
                        catch(ArithmeticException e){
                                System.out.println("Arithmetic error");
                        }

                        catch(ArrayIndexOutBoundsException){
                                System.out.println("Array index "); 
                        }
                                
                        
                }

             
        }
}