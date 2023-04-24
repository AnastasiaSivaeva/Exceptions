//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
//новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

package Seminar_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        int[] array1 = {1, 4, 7, 5, 6};
        int[] array2 = {6, 3, 10, 0}; 
        CheckArr(array1, array2);
    }

    public static int CheckArr(int[] arr1, int[] arr2){
        int res = 0;
        if(arr1.length > arr2.length || arr2.length > arr1.length){
            System.out.println("Ошибка: Длина первого массива отличается от длины второго");
        }else{
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                   res = arr1[i] - arr2[j];

                }
            }
        }
        return res;
    }

}
