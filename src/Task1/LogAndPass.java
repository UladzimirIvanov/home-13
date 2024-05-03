package Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogAndPass {

    static boolean logPassCPass(String login, String password, String confirmPassword) {

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(password);

        boolean checkNumberInPassword = false;
        if (m.find()) {
            checkNumberInPassword = true;
        }

        if (login.length() > 20 || login.contains(" ")) {
            try {
                throw new WrongLoginException(login);
            } catch (WrongLoginException e) {
                System.out.println(e);
            }
        }

        if (password.length() > 20 || password.contains(" ") || !checkNumberInPassword || !password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException(password);
            } catch (WrongPasswordException e) {
                System.out.println(e);
            }
        }
        return true;
    }
}
