package X;

import java.util.Comparator;

/* renamed from: X.3xV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81743xV implements Comparator {
    public static final /* synthetic */ C81743xV A00 = new C81743xV();

    public final int compare(Object obj, Object obj2) {
        C65663Sz r5 = (C65663Sz) obj;
        C65663Sz r6 = (C65663Sz) obj2;
        if (r5.A0B()) {
            return -1;
        }
        if (r6.A0B()) {
            return 1;
        }
        if (r5.A03() > 0 && r6.A03() == 0) {
            return -1;
        }
        if (r5.A03() == 0 && r6.A03() > 0) {
            return 1;
        }
        if (r5.A09 instanceof C177638e7) {
            return -1;
        }
        if (!(r6.A09 instanceof C177638e7)) {
            return -Long.compare(r5.A05(), r6.A05());
        }
        return 1;
    }
}
