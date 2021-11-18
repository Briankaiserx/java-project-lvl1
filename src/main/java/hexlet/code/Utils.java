package hexlet.code;

public abstract class Utils {
    public static final int MAX_NUMBER = 100;

    public static int generateRandom(int number) {
        return (int) (Math.random() * number);
    }
}
