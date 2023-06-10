import java.util.*;

public class MyStreamAPIExamples {
    public static void start() {
        System.out.println("\nInside Stream API Usage");
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Case One, Empty String Count is => " + strList + " " + count);
    }
}
