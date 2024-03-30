package X;

/* renamed from: X.82Q  reason: invalid class name */
public final class AnonymousClass82Q extends C208989zH {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[LOOP:2: B:23:0x006d->B:24:0x006f, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:14:0x0034, B:24:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmg(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            int r3 = r9.position()
            int r2 = r9.limit()
            int r7 = r2 - r3
            X.9gA r0 = r8.A00
            int r1 = r0.A02
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = 3
            if (r1 == r4) goto L_0x002a
            r0 = 4
            if (r1 == r0) goto L_0x0025
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L_0x002c
            if (r1 == r5) goto L_0x0028
            if (r1 == r6) goto L_0x0025
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        L_0x0025:
            int r7 = r7 / 2
            goto L_0x002c
        L_0x0028:
            int r7 = r7 / 3
        L_0x002a:
            int r7 = r7 * 2
        L_0x002c:
            java.nio.ByteBuffer r1 = r8.A02(r7)
            X.9gA r0 = r8.A00
            int r0 = r0.A02
            if (r0 == r4) goto L_0x006d
            if (r0 == r5) goto L_0x0056
            if (r0 == r6) goto L_0x003f
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        L_0x003f:
            if (r3 >= r2) goto L_0x0082
            int r0 = r3 + 2
            byte r0 = r9.get(r0)
            r1.put(r0)
            int r0 = r3 + 3
            byte r0 = r9.get(r0)
            r1.put(r0)
            int r3 = r3 + 4
            goto L_0x003f
        L_0x0056:
            if (r3 >= r2) goto L_0x0082
            int r0 = r3 + 1
            byte r0 = r9.get(r0)
            r1.put(r0)
            int r0 = r3 + 2
            byte r0 = r9.get(r0)
            r1.put(r0)
            int r3 = r3 + 3
            goto L_0x0056
        L_0x006d:
            if (r3 >= r2) goto L_0x0082
            r0 = 0
            r1.put(r0)
            byte r0 = r9.get(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + -128
            byte r0 = (byte) r0
            r1.put(r0)
            int r3 = r3 + 1
            goto L_0x006d
        L_0x0082:
            X.C165597tg.A1K(r9)
            r1.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82Q.Bmg(java.nio.ByteBuffer):void");
    }
}
