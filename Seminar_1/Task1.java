//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package Seminar_1;

 public class Task1{

    public static void main(String[] arg){
        int num1 = 6;
        int num2 = 0;
        if(num1 == 0){
            System.out.println("Операция деления на 0 невозможна. Введите другое число");
        }
        if(num2 == 0){
            System.out.println("Операция деления на 0 невозможна. Введите другое число");
        }else{
            System.out.println("Ответ:" +(num1 / num2));
        }
    }

    // public static void main(String[] arg){
    //     int[] array = {1, 4, 7, 5};
    //     findInd(array, 5);


    // }

    // public static int findInd(int[] arr, int searchInd){
    //     if (searchInd > arr.length){
    //         System.out.println("Длина массива меньше заданного индекса");
    //     }else{
    //         System.out.println("Условия корректны, значения найдены");
    //     }
    //     return 0;
    // }

//     public static void main(String[] arg){
//         int size = -4;
//         int[] array = new int[size];
//         if(size < 0){
//             System.out.println("Значение индекса не может быть отрицательным");
//         }else{
//             for (int i = 0; i < array.length; i++) {
//                 array[i] = (int) Math.round(Math.random() * 6);
//                 System.out.println(array[i]);
//             }
//         }
//     }

}
