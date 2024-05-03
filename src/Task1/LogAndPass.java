package Task1;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class LogAndPass {

    static boolean logPassCPass(String login, String password, String confirmPassword) {

        if (login.length() > 20 || login.contains(" ")) {
            try {
                throw new WrongLoginException(login);
            } catch (WrongLoginException e){
                System.out.println(e);
            }
        }

        System.out.println(password);
        System.out.println(confirmPassword);
        return true;
    }
}
