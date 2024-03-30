package X;

import java.util.List;

/* renamed from: X.61T  reason: invalid class name */
public final class AnonymousClass61T {
    public final C000700i A00;
    public final C118315ng A01;

    public final boolean A00(long j) {
        Object obj;
        List list = this.A01.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((C128856Dw) obj).A02 == j) {
                break;
            }
            i++;
        }
        C128856Dw r3 = (C128856Dw) obj;
        if (r3 != null) {
            return r3.A0A;
        }
        return false;
    }

    public AnonymousClass61T(C000700i r1, C118315ng r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
