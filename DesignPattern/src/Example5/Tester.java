package Example5;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String []data = {"Mississippi", "Informatik", "Allee", "Mississippi", "Allee"};
        ICountChars cc = new CharCache();
        Arrays.stream(data).forEach(s -> System.out.println(cc.countChars(s)));
    }
}
