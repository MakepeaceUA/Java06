import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер набора чисел: ");
        int size = scanner.nextInt();

        System.out.print("Введите число для поиска совпадений: ");
        int userNum = scanner.nextInt();

        int[] numbers = random.ints(size, 0, 101).toArray();

        System.out.println("Сгенерированный набор: " + Arrays.toString(numbers));

        long evenCount = Arrays.stream(numbers).filter(n -> n % 2 == 0).count();

        long oddCount = Arrays.stream(numbers).filter(n -> n % 2 != 0).count();

        long equalCount = Arrays.stream(numbers).filter(n -> n == userNum).count();

        System.out.println("Количество четных: " + evenCount);
        System.out.println("Количество нечетных: " + oddCount);
        System.out.println("Количество равных числу " + userNum + ": " + equalCount);
    }
}