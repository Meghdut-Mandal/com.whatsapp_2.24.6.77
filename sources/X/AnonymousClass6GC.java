package X;

import java.util.List;

/* renamed from: X.6GC  reason: invalid class name */
public abstract class AnonymousClass6GC {
    public static final int A00(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            AnonymousClass6DO r1 = (AnonymousClass6DO) list.get(i3);
            if (r1.A05 > i) {
                size = i3 - 1;
            } else if (r1.A04 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int A01(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            AnonymousClass6DO r1 = (AnonymousClass6DO) list.get(i3);
            if (r1.A03 > i) {
                size = i3 - 1;
            } else if (r1.A02 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }
}
