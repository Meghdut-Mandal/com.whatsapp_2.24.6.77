package X;

import java.util.Comparator;

public class AXR implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) obj).compareToIgnoreCase((String) obj2);
    }
}
