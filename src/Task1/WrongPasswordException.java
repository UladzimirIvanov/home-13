package Task1;

public class WrongPasswordException extends Exception {
    private String password;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Пароль " + password + " не соответствует требованиям";
    }
}
