//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый 
// массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода 
// единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package Seminar_1;

public class Task_4 {

    public static void main(int[] arr){
        int[] array1 = {1, 4, 7, 5};
        int[] array2 = {6, 3, 10, 0};
        CheckArr(array1, array2);
    }

    public static int CheckArr(int[] arr1, int[] arr2){
        Integer quot = null;
        if(arr1.length > arr2.length){
            throw new RuntimeException("Ошибка: Длина первого массива отличается от длины второго");
        }if(arr2.length > arr1.length){
            throw new RuntimeException("Ошибка: Длина первого массива отличается от длины второго");
        }else{
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] == 0 || arr2[j] == 0){
                        throw new RuntimeException("Деление на 0 невозможно");
                    }else{
                        quot = arr1[i] / arr2[j];
                    }
                }
            }
        }
        return quot;
    }


    
}
