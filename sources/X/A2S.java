package X;

import java.util.HashSet;

public class A2S implements C22883Axe {
    public boolean B6s(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
