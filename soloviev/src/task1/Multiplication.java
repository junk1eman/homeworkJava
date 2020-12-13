package task1;

public class Multiplication {
    public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.format("%4d", result);
            }
            System.out.println();
        }
    }
}