package X;

import java.util.List;

/* renamed from: X.4v1  reason: invalid class name and case insensitive filesystem */
public final class C100444v1 extends C140456lc {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h() {
        /*
            r8 = this;
            boolean r0 = X.AnonymousClass6Qn.A01(r8)
            r5 = 0
            if (r0 != 0) goto L_0x0026
            X.6T8 r0 = X.AnonymousClass6NR.A01()
            int r4 = r8.A04
            int[] r3 = r0.A01(r4)
            X.AnonymousClass00C.A0B(r3)
            int r2 = r3.length
            r1 = 0
        L_0x0016:
            if (r1 >= r2) goto L_0x0075
            r0 = r3[r1]
            X.6lc r0 = r8.A0W(r0)
            if (r0 == 0) goto L_0x0072
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0072
        L_0x0026:
            r5 = 1
        L_0x0027:
            int r0 = r8.A00
            if (r5 == 0) goto L_0x006f
            r0 = r0 | 1
        L_0x002d:
            r8.A00 = r0
            java.util.HashSet r5 = X.C36441kJ.A16()
            boolean r0 = X.AnonymousClass6Qn.A02(r8)
            if (r0 == 0) goto L_0x003e
            int r0 = r8.A03
            X.AnonymousClass000.A1F(r5, r0)
        L_0x003e:
            X.6T8 r0 = X.AnonymousClass6NR.A01()
            int r7 = r8.A04
            int[] r4 = r0.A01(r7)
            X.AnonymousClass00C.A0B(r4)
            int r3 = r4.length
            r6 = 0
            r2 = 0
        L_0x004e:
            if (r2 >= r3) goto L_0x00a4
            r0 = r4[r2]
            X.6lc r0 = r8.A0W(r0)
            if (r0 == 0) goto L_0x006c
            java.util.Set r1 = r0.A02
            if (r1 != 0) goto L_0x0060
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0060:
            X.AnonymousClass00C.A0B(r1)
            boolean r0 = X.C90514aH.A1a(r1)
            if (r0 == 0) goto L_0x006c
            r5.addAll(r1)
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x004e
        L_0x006f:
            r0 = r0 & -2
            goto L_0x002d
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0075:
            X.6T8 r0 = X.AnonymousClass6NR.A01()
            int[] r4 = r0.A00(r4)
            X.AnonymousClass00C.A0B(r4)
            int r3 = r4.length
            r2 = 0
        L_0x0082:
            if (r2 >= r3) goto L_0x0027
            r0 = r4[r2]
            java.util.List r0 = r8.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            X.6lc r0 = X.C90514aH.A0Y(r1)
            if (r0 == 0) goto L_0x008e
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x008e
            goto L_0x0026
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x0082
        L_0x00a4:
            X.6T8 r0 = X.AnonymousClass6NR.A01()
            int[] r4 = r0.A00(r7)
            X.AnonymousClass00C.A0B(r4)
            int r3 = r4.length
        L_0x00b0:
            if (r6 >= r3) goto L_0x00e0
            r0 = r4[r6]
            java.util.List r0 = r8.A0c(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00bc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dd
            X.6lc r0 = X.C90514aH.A0Y(r2)
            if (r0 == 0) goto L_0x00bc
            java.util.Set r1 = r0.A02
            if (r1 != 0) goto L_0x00d0
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x00d0:
            X.AnonymousClass00C.A0B(r1)
            boolean r0 = X.C90514aH.A1a(r1)
            if (r0 == 0) goto L_0x00bc
            r5.addAll(r1)
            goto L_0x00bc
        L_0x00dd:
            int r6 = r6 + 1
            goto L_0x00b0
        L_0x00e0:
            r1 = r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00e8
            r1 = 0
        L_0x00e8:
            r8.A02 = r1
            boolean r1 = X.C36411kG.A1a(r5)
            int r0 = r8.A00
            if (r1 == 0) goto L_0x00f7
            r0 = r0 | 2
        L_0x00f4:
            r8.A00 = r0
            return
        L_0x00f7:
            r0 = r0 & -3
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100444v1.A0h():void");
    }

    public C100444v1(List list, int i, int i2) {
        super(list, i, i2);
    }
}
