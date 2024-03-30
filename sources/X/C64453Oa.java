package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Oa  reason: invalid class name and case insensitive filesystem */
public final class C64453Oa {
    public final List A00;

    public static final Pair A00(C64453Oa r9) {
        List list = r9.A00;
        double A002 = C54742tR.A00(list);
        AnonymousClass00C.A0D(list, 0);
        double A003 = C54742tR.A00(list);
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            double A0A = ((double) C36341k9.A0A(it)) - A003;
            d += A0A * A0A;
        }
        double sqrt = Math.sqrt(d / ((double) list.size()));
        return C36341k9.A0I(Integer.valueOf((int) (A002 - (((double) 2) * sqrt))), (int) (A002 + (((double) 1) * sqrt)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r7) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            int r1 = r5.size()
            r0 = 10
            if (r1 < r0) goto L_0x0041
            android.util.Pair r1 = A00(r6)
            java.lang.Object r0 = r1.first
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r7 >= r0) goto L_0x002e
            java.lang.Object r0 = r1.first
        L_0x001b:
            X.AnonymousClass00C.A07(r0)
        L_0x001e:
            r5.add(r0)
            int r1 = r5.size()
            r0 = 20
            if (r1 <= r0) goto L_0x002d
            r0 = 0
            r5.remove(r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.Object r0 = r1.second
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r7 <= r0) goto L_0x003c
            java.lang.Object r0 = r1.second
            goto L_0x001b
        L_0x003c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x001e
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.add(r0)
            int r1 = r5.size()
            r0 = 10
            if (r1 < r0) goto L_0x002d
            android.util.Pair r4 = A00(r6)
            r3 = 0
            int r2 = r5.size()
        L_0x0059:
            if (r3 >= r2) goto L_0x002d
            int r1 = X.C36351kA.A06(r5, r3)
            java.lang.Object r0 = r4.first
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r1 >= r0) goto L_0x0075
            java.lang.Object r0 = r4.first
        L_0x006c:
            X.AnonymousClass00C.A07(r0)
            r5.set(r3, r0)
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0075:
            java.lang.Object r0 = r4.second
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r1 <= r0) goto L_0x0072
            java.lang.Object r0 = r4.second
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64453Oa.A01(int):void");
    }

    public C64453Oa(List list) {
        this.A00 = list;
    }
}
