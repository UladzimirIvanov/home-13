package Task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String userLogin = scanner.nextLine();
        System.out.println("Введите пароль:");
        String userPassword = scanner.nextLine();
        System.out.println("Повторите пароль:");
        String userConfirmPassword = scanner.nextLine();

        LogAndPass.logPassCPass(userLogin, userPassword, userConfirmPassword);









/*        try {
            FileInputStream inputStream = new FileInputStream("PATH");
        } catch (FileNotFoundException exception){
            System.out.println("Всё отлично, мы её поймали!" + exception);
        }
        System.out.println("Мы увидим этот код");*/
    }
}
