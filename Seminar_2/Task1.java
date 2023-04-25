// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.

package Seminar_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] arr){
        System.out.println("Введите любое дробное число ");
        Scanner scanner = new Scanner(System.in);
        try{
            Float num = scanner.nextFloat();
            System.out.println("Введенное дробное число: "+ num);
        }catch (Exception e) {
            throw new RuntimeException("Неверный формат преобразования, пожалуйста, введите число еще раз ");
        }
    }
    
}
