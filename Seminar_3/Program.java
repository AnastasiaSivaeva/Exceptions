package Seminar_3;

import java.io.FileWriter;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Task1 {
    public static void main(String[] arr){
        String newFileName = null;
        WriteFile writeFile = new WriteFile();
    }

    public static String[] InputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Ф.И.О, дату рождения в формате дд.мм.гггг, номер телефона, пол в формате М/Ж: ");
        String data = scanner.nextLine();
        String[] arrData = data.split(" ");
        if(arrData.length == 6){
            return arrData;
        }else if( arrData.length < 6){
            System.out.println("Вы ввели не все данные, попробуйте снова");
        }else System.out.println("Вы ввели лишние данные, попробуйте снова");
        return null;
    }

    public void WriteFile(){
        try(FileWriter fw = new FileWriter()){
            fw.append(data);

        }

    }


}