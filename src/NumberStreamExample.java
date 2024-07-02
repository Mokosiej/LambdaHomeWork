import java.util.Arrays;
import java.util.List;


public class NumberStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);


        int sum = numbers.stream()
                .map(n -> n + 15)
                .filter(n -> n > 50)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма чисел: " + sum);
    }
}
