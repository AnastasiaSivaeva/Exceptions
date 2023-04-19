//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package Seminar_1;

public class Task1{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = num1 / num2;
        if(num1 == 0 || num2 == 0){
            System.out.println("Ошибка арифметического вычисления. Введите число корректно");
        }else{
            System.out.println("Ответ: " +result);
        }
    }
}
