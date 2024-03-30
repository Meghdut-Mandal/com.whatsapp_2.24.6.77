package X;

import android.widget.TextView;

/* renamed from: X.3TF  reason: invalid class name */
public abstract class AnonymousClass3TF {
    public static String A02(C18820ts r1, long j) {
        return (String) A00(r1, j, false, false).first;
    }

    public static String A03(C18820ts r2, long j) {
        return (String) A00(r2, j, false, true).first;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.C18820ts r21, long r22, boolean r24, boolean r25) {
        /*
            r6 = r22
            r0 = 0
            int r20 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            r19 = 0
            if (r20 >= 0) goto L_0x000d
            r19 = 1
            long r6 = -r6
        L_0x000d:
            if (r25 == 0) goto L_0x00b5
            r8 = 1024(0x400, double:5.06E-321)
            r4 = 1048576(0x100000, double:5.180654E-318)
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            r0 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r10 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
        L_0x001e:
            r17 = 900(0x384, double:4.447E-321)
            long r14 = r8 * r17
            java.lang.String r16 = "%.1f"
            java.lang.String r13 = "%.0f"
            int r12 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x008b
            float r12 = (float) r6
            float r0 = (float) r8
            float r12 = r12 / r0
            r2 = 282(0x11a, float:3.95E-43)
            if (r20 == 0) goto L_0x0040
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            r1 = 1
        L_0x0036:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            java.lang.String r16 = "%.2f"
        L_0x003e:
            r13 = r16
        L_0x0040:
            if (r19 == 0) goto L_0x0043
            float r12 = -r12
        L_0x0043:
            r7 = r21
            java.util.Locale r1 = X.C36401kF.A0x(r7)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Float r3 = java.lang.Float.valueOf(r12)
            r6 = 0
            r0[r6] = r3
            java.lang.String r5 = java.lang.String.format(r1, r13, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r3
            java.lang.String r4 = java.lang.String.format(r1, r13, r0)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r6] = r5
            java.util.Locale r1 = X.C36401kF.A0x(r7)
            X.1Kv r0 = X.C18820ts.A00(r7)
            X.1MA r0 = r0.A04
            java.lang.String r0 = r0.A02(r4, r2)
            java.lang.String r0 = java.lang.String.format(r1, r0, r3)
            java.lang.String r0 = r7.A0G(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r4)
            return r0
        L_0x0080:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            if (r24 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x0040
            goto L_0x003e
        L_0x008b:
            long r14 = r4 * r17
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x0098
            float r12 = (float) r6
            float r0 = (float) r4
            float r12 = r12 / r0
            r2 = 283(0x11b, float:3.97E-43)
        L_0x0096:
            r1 = 0
            goto L_0x0036
        L_0x0098:
            long r8 = r2 * r17
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x00a4
            float r12 = (float) r6
            float r0 = (float) r2
            float r12 = r12 / r0
            r2 = 278(0x116, float:3.9E-43)
            goto L_0x0096
        L_0x00a4:
            long r17 = r17 * r0
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            float r12 = (float) r6
            if (r2 > 0) goto L_0x00b0
            float r2 = (float) r0
            float r12 = r12 / r2
            r2 = 293(0x125, float:4.1E-43)
            goto L_0x0096
        L_0x00b0:
            float r0 = (float) r10
            float r12 = r12 / r0
            r2 = 289(0x121, float:4.05E-43)
            goto L_0x0096
        L_0x00b5:
            r8 = 1000(0x3e8, double:4.94E-321)
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r10 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TF.A00(X.0ts, long, boolean, boolean):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C601336p A01(X.C18820ts r17, long r18) {
        /*
            r8 = r18
            double r1 = (double) r8
            r5 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r14 = 0
        L_0x0009:
            r13 = 3
            r15 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r14 >= r13) goto L_0x0019
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            double r1 = r1 / r15
            int r14 = r14 + 1
            goto L_0x0009
        L_0x0019:
            java.util.Locale r6 = X.C36401kF.A0x(r17)
            r11 = 0
            java.lang.String r10 = ""
            r7 = 282(0x11a, float:3.95E-43)
            r4 = 1
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r3
            java.lang.String r2 = "%d"
        L_0x002e:
            java.lang.String r6 = java.lang.String.format(r6, r2, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r3
            java.lang.String r10 = java.lang.String.format(r1, r2, r0)
        L_0x003c:
            X.1Kv r0 = X.C18820ts.A00(r17)
            X.1MA r0 = r0.A04
            java.lang.String r3 = r0.A02(r10, r7)
            java.lang.String r0 = "%1$s"
            int r1 = r3.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0050
            r4 = 0
        L_0x0050:
            X.C18740tg.A0C(r4)
            int r0 = r1 + 4
            java.lang.String r2 = r3.substring(r5, r1)
            java.lang.String r1 = r3.substring(r0)
            X.36p r0 = new X.36p
            r0.<init>(r2, r6, r1)
            return r0
        L_0x0063:
            java.lang.String r3 = "%1$.1f"
            if (r14 == 0) goto L_0x00ad
            if (r14 == r4) goto L_0x00a2
            r0 = 2
            if (r14 == r0) goto L_0x0089
            if (r14 == r13) goto L_0x0070
            r6 = r10
            goto L_0x003c
        L_0x0070:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r5] = r2
            java.lang.String r6 = java.lang.String.format(r6, r3, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r10 = java.lang.String.format(r1, r3, r0)
            r7 = 278(0x116, float:3.9E-43)
            goto L_0x003c
        L_0x0089:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r5] = r2
            java.lang.String r6 = java.lang.String.format(r6, r3, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r10 = java.lang.String.format(r1, r3, r0)
            r7 = 283(0x11b, float:3.97E-43)
            goto L_0x003c
        L_0x00a2:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            r0[r5] = r3
            java.lang.String r2 = "%1$.0f"
            goto L_0x002e
        L_0x00ad:
            double r1 = r1 / r15
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r5] = r2
            java.lang.String r6 = java.lang.String.format(r6, r3, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r10 = java.lang.String.format(r1, r3, r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TF.A01(X.0ts, long):X.36p");
    }

    public static String A04(C18820ts r0, long j) {
        C601336p A01 = A01(r0, j);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A01.A01);
        A0u.append(A01.A02);
        return AnonymousClass000.A0q(A01.A00, A0u);
    }

    public static void A05(TextView textView, C18820ts r2, long j) {
        textView.setText(A04(r2, j));
    }
}
