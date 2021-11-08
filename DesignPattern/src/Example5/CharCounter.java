package Example5;

public class CharCounter implements ICountChars {
    @Override
    public int countChars(String str) {
        return (int) str.chars().distinct().count();
    }
}
