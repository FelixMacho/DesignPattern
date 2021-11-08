package Example5;

import java.util.HashMap;
import java.util.Map;

public class CharCache implements ICountChars {
    private final Map<String, Integer> cache;
    private final CharCounter cc;

    public CharCache() {
        cc = new CharCounter();
        cache = new HashMap<>();
    }

    @Override
    public int countChars(String str) {
        int anz;
        if (cache.containsKey(str)) {
            anz = cache.get(str);
            System.out.print(str + " from Supplier1 ");

        } else {
            anz = cc.countChars(str);
            System.out.print(str + " from Supplier2: ");
            cache.put(str, anz);
        }
        return anz;
    }
}