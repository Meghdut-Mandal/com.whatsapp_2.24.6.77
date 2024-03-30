package X;

import android.os.ConditionVariable;

/* renamed from: X.1Vg  reason: invalid class name and case insensitive filesystem */
public final class C29081Vg {
    public static final byte[] A01 = {-64, -64, -84, 13, -27};
    public static final byte[] A02 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80, -126, 122, -47, -94};
    public static final byte[] A03 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80};
    public static final byte[] A04 = {-36, -126, -121, -22, -55, 119, -71, -37, 120, 47, -71, 121, -26, -22, 100, -81, 45, 103, -67, 15, -67, -88, -22, 15, 114, -5, 81, -103, 113, -84, 12, -105};
    public static final byte[] A05 = {-7, 71, 124, 78, 52, -54, 47, 3, 87, 98, -48, 115, -53, 25, -3, 62, -105, 76, -20, 126, -91, -4, 49, -11, -64, -104, 62, 25, -14, 43, -99, -124};
    public Boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (java.util.Arrays.equals(A02, r5) != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r11, byte[] r12) {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10.A00
            r9 = 0
            if (r0 != 0) goto L_0x009d
            if (r12 == 0) goto L_0x00a1
            r8 = 1
            if (r11 == 0) goto L_0x0057
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05
            byte[] r1 = r11.getBytes(r0)
            X.AnonymousClass00C.A08(r1)
            int r0 = r1.length
            byte[] r7 = java.util.Arrays.copyOf(r1, r0)
            X.AnonymousClass00C.A08(r7)
            int r6 = r7.length
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0020:
            if (r4 >= r6) goto L_0x0034
            byte r2 = r7[r4]
            byte[] r0 = A01
            int r1 = r3 + 1
            byte r0 = r0[r3]
            r0 = r0 ^ r2
            byte r0 = (byte) r0
            r5[r4] = r0
            r0 = 5
            int r3 = r1 % r0
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0034:
            byte[] r0 = A03
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x0045
            byte[] r0 = A02
            boolean r1 = java.util.Arrays.equals(r0, r5)
            r0 = 1
            if (r1 == 0) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r10.A00 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0057
            return r8
        L_0x0057:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = r0.digest(r12)
            X.AnonymousClass00C.A08(r1)
            int r0 = r1.length
            byte[] r7 = java.util.Arrays.copyOf(r1, r0)
            X.AnonymousClass00C.A08(r7)
            int r6 = r7.length
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0071:
            if (r4 >= r6) goto L_0x0085
            byte r2 = r7[r4]
            byte[] r0 = A01
            int r1 = r3 + 1
            byte r0 = r0[r3]
            r0 = r0 ^ r2
            byte r0 = (byte) r0
            r5[r4] = r0
            r0 = 5
            int r3 = r1 % r0
            int r4 = r4 + 1
            goto L_0x0071
        L_0x0085:
            byte[] r0 = A04
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x00a2
            byte[] r0 = A05
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x00a2
        L_0x0095:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r10.A00 = r0
            if (r0 == 0) goto L_0x00a1
        L_0x009d:
            boolean r9 = r0.booleanValue()
        L_0x00a1:
            return r9
        L_0x00a2:
            r8 = 0
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29081Vg.A00(java.lang.String, byte[]):boolean");
    }

    public C29081Vg() {
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
