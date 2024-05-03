package TaskHard;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            try {
                System.out.println(10 / 2);
            } catch (ArithmeticException e){
                System.out.println("Ошибка внутри " + e);
            } finally {
                System.out.println("Не выполнится, ведь мы сюда и не зашли");
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка снаружи " + e);
        }
    }
}
