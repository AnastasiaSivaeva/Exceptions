package Seminar_1;

public class Task3 {
    public static void main(String[] args){
        int[] array1 = {1, 4, 7, 5};
        int[] array2 = {6, 3, 10, 0};
        CheckArr(array1, array2);
    }

    public static int CheckArr(int[] arr1, int[] arr2){
        int dif = 0;
        if(arr1.length > arr2.length || arr2.length > arr1.length){
            System.out.println("Ошибка: Длина первого массива отличается от длины второго");
        }else{
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    dif = dif + arr1[i] - arr2[j];
                }
            }
        }
        return dif;
    }
}
