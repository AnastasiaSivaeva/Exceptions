// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно 
// показаться сообщение, что пустые строки вводить нельзя.

package Seminar_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        System.out.println("Введите сообщение: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String text = scanner.nextLine();
            //double valid = Double.parseDouble(text.trim());
            if(text.length() > 0){
                System.out.println("Введенное сообщение: "+ text);
            } else{
                System.out.println("Пустые строки вводить нельзя, попробуйте зановоzz ");
            }
        }catch (NumberFormatException e){
            throw new RuntimeException("Пустые строки вводить нельзя, попробуйте заново ");
        }
    }
}
