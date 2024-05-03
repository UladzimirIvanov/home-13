package Task1;

public class WrongLoginException extends Exception{
    private String login;
    public WrongLoginException() {
    }

    public WrongLoginException(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Login " + login + " содержит пробелы или имеет более 20 символов";
    }
}
