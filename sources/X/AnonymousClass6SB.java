package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6SB  reason: invalid class name */
public class AnonymousClass6SB {
    public static AnonymousClass6SB A04 = new AnonymousClass6SB(-2);
    public final int A00;
    public final List A01;
    public final Map A02;
    public final boolean A03 = false;

    public AnonymousClass6SB(List list, Map map, int i) {
        this.A00 = i;
        this.A02 = Collections.unmodifiableMap(map);
        this.A01 = Collections.unmodifiableList(list);
    }

    public AnonymousClass6SB(int i) {
        this.A00 = i;
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyList();
    }
}
