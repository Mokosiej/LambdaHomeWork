import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringStreamExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("short", "a bit longer", "this is definitely the longest string", "tiny", "123456789012345");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() <= 15)
                .collect(Collectors.toList());

        Optional<String> longestString = filteredStrings.stream()
                .max(Comparator.comparingInt(String::length));


        System.out.println("Строки, которые состоят из 15 символов или меньше: " + filteredStrings);
        longestString.ifPresent(s -> System.out.println("Самая длинная строка: " + s));
    }
}
