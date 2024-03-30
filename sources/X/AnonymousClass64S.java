package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.64S  reason: invalid class name */
public final class AnonymousClass64S {
    public C161167mI A00;
    public final Map A01 = C36431kI.A1G();
    public final LinkedHashSet A02 = C36441kJ.A17();
    public final List A03 = AnonymousClass001.A0I();
    public final List A04 = AnonymousClass001.A0I();
    public final List A05 = AnonymousClass001.A0I();
    public final List A06 = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r25 == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass65G r19, java.util.List r20, int r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r18 = this;
            r9 = r18
            X.7mI r8 = r9.A00
            r15 = r19
            X.7mw r0 = r15.A01
            X.6ey r0 = (X.C136776ey) r0
            X.7mI r7 = r0.A02
            r9.A00 = r7
            r12 = r20
            int r5 = r12.size()
            r4 = 0
        L_0x0015:
            if (r4 >= r5) goto L_0x0035
            java.lang.Object r0 = r12.get(r4)
            X.6ex r0 = (X.C136766ex) r0
            java.util.List r3 = r0.A08
            int r2 = r3.size()
            r1 = 0
        L_0x0024:
            if (r1 >= r2) goto L_0x0032
            java.lang.Object r0 = r3.get(r1)
            X.6Q4 r0 = (X.AnonymousClass6Q4) r0
            r0.BF4()
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0035:
            java.util.Map r6 = r9.A01
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0045
            r6.clear()
            X.6f3 r0 = X.C161167mI.A00
            r9.A00 = r0
            return
        L_0x0045:
            X.C007103b.A0M(r12)
            r11 = r21
            r17 = r11
            r10 = r22
            if (r23 == 0) goto L_0x0052
            r17 = r10
        L_0x0052:
            if (r24 != 0) goto L_0x0058
            r16 = 0
            if (r25 != 0) goto L_0x005a
        L_0x0058:
            r16 = 1
        L_0x005a:
            java.util.LinkedHashSet r14 = r9.A02
            java.util.Set r0 = r6.keySet()
            r14.addAll(r0)
            int r13 = r12.size()
            r5 = 0
        L_0x0068:
            if (r5 >= r13) goto L_0x0090
            java.lang.Object r0 = r12.get(r5)
            X.6ex r0 = (X.C136766ex) r0
            java.lang.Object r4 = r0.A07
            r14.remove(r4)
            java.util.List r3 = r0.A08
            int r2 = r3.size()
            r1 = 0
        L_0x007c:
            if (r1 >= r2) goto L_0x008a
            java.lang.Object r0 = r3.get(r1)
            X.6Q4 r0 = (X.AnonymousClass6Q4) r0
            r0.BF4()
            int r1 = r1 + 1
            goto L_0x007c
        L_0x008a:
            r6.remove(r4)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0090:
            if (r16 == 0) goto L_0x00de
            if (r8 == 0) goto L_0x00de
            java.util.List r4 = r9.A06
            int r0 = r4.size()
            r3 = 1
            if (r0 <= r3) goto L_0x00a1
            r0 = 2
            X.C163897qw.A00(r8, r4, r0)
        L_0x00a1:
            int r1 = r4.size()
            r0 = 0
            r2 = 0
            if (r0 >= r1) goto L_0x00bb
            java.lang.Object r0 = r4.get(r0)
            X.6ex r0 = (X.C136766ex) r0
            java.lang.Object r0 = r0.A07
            X.C000200c.A00(r0, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00bb:
            java.util.List r1 = r9.A05
            int r0 = r1.size()
            if (r0 <= r3) goto L_0x00c6
            X.C163897qw.A00(r8, r1, r2)
        L_0x00c6:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x00de
            java.lang.Object r0 = r1.get(r2)
            X.6ex r0 = (X.C136766ex) r0
            java.lang.Object r0 = r0.A07
            X.C000200c.A00(r0, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00de:
            java.util.Iterator r3 = r14.iterator()
        L_0x00e2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r3.next()
            int r1 = r7.BCd(r2)
            r0 = -1
            if (r1 != r0) goto L_0x00f7
            r6.remove(r2)
            goto L_0x00e2
        L_0x00f7:
            r15.A00(r1)
            X.C000200c.A00(r2, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0104:
            java.util.List r3 = r9.A04
            int r1 = r3.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0111
            r0 = 3
            X.C163897qw.A00(r7, r3, r0)
        L_0x0111:
            int r5 = r3.size()
            r4 = 0
            r2 = 0
        L_0x0117:
            if (r2 >= r5) goto L_0x0143
            java.lang.Object r1 = r3.get(r2)
            X.6ex r1 = (X.C136766ex) r1
            int r0 = r1.A05
            int r4 = r4 + r0
            if (r24 == 0) goto L_0x0141
            java.lang.Object r0 = X.C007103b.A0L(r12)
            X.6ex r0 = (X.C136766ex) r0
            int r0 = r0.A00
            int r0 = r0 - r4
        L_0x012d:
            r1.A00(r0, r11, r10)
            if (r16 == 0) goto L_0x013e
            java.lang.Object r0 = r1.A07
            X.C000200c.A00(r0, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x013e:
            int r2 = r2 + 1
            goto L_0x0117
        L_0x0141:
            int r0 = -r4
            goto L_0x012d
        L_0x0143:
            java.util.List r2 = r9.A03
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x014f
            X.C163897qw.A00(r7, r2, r0)
        L_0x014f:
            int r7 = r2.size()
            r8 = 0
            r5 = 0
        L_0x0155:
            if (r5 >= r7) goto L_0x0185
            java.lang.Object r4 = r2.get(r5)
            X.6ex r4 = (X.C136766ex) r4
            if (r24 == 0) goto L_0x0182
            java.lang.Object r0 = X.C007103b.A0N(r12)
            X.6ex r0 = (X.C136766ex) r0
            int r1 = r0.A00
            int r0 = r0.A05
            int r1 = r1 + r0
            int r1 = r1 + r8
        L_0x016b:
            int r0 = r4.A05
            int r8 = r8 + r0
            r4.A00(r1, r11, r10)
            if (r16 == 0) goto L_0x017f
            java.lang.Object r0 = r4.A07
            X.C000200c.A00(r0, r6)
            java.lang.String r0 = "getAnimations"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x017f:
            int r5 = r5 + 1
            goto L_0x0155
        L_0x0182:
            int r1 = r17 + r8
            goto L_0x016b
        L_0x0185:
            java.util.Collections.reverse(r3)
            r0 = 0
            r12.addAll(r0, r3)
            r12.addAll(r2)
            java.util.List r0 = r9.A06
            r0.clear()
            java.util.List r0 = r9.A05
            r0.clear()
            r3.clear()
            r2.clear()
            r14.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64S.A00(X.65G, java.util.List, int, int, boolean, boolean, boolean):void");
    }
}
