package X;

import java.util.Comparator;

public abstract class AXU implements Comparator {
    public abstract int compare(Object obj, Object obj2);

    public static AXU natural() {
        return C170828Hq.INSTANCE;
    }
}
