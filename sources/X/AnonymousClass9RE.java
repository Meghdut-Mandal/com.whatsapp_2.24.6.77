package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.9RE  reason: invalid class name */
public class AnonymousClass9RE {
    public final long A00;
    public final List A01;
    public final List A02;

    public static AnonymousClass9O1 A00(AnonymousClass9RE r0, int i) {
        return (AnonymousClass9O1) r0.A01.get(i);
    }

    public int A01(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AnonymousClass9O1) list.get(i2)).A00 == i) {
                return i2;
            }
        }
        return -1;
    }

    public AnonymousClass9RE(List list, List list2, long j) {
        this.A00 = j;
        this.A01 = Collections.unmodifiableList(list);
        this.A02 = Collections.unmodifiableList(list2);
    }
}
