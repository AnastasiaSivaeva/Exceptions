package Seminar_2;

public class Task2 {
    public static void main(String[] arr){
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 2;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    
}
