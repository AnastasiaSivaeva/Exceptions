package Seminar_3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Это неверные данные: %s", i);
        System.out.println();
    } 
}
    

